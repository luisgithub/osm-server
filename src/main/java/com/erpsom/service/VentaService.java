package com.erpsom.service;

import com.erpsom.domain.*;
import com.erpsom.domain.json.ComprobanteInfo;
import com.erpsom.repository.*;
import mx.bigdata.sat.cfdi.CFDv32;
import mx.bigdata.sat.cfdi.v32.schema.*;
import mx.bigdata.sat.security.KeyLoaderEnumeration;
import mx.bigdata.sat.security.factory.KeyLoaderFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class VentaService {

    static final Logger logger = LogManager.getLogger(VentaService.class.getName());

    @Autowired
    ComprobanteRepository comprobanteRepository;

    @Autowired
    VentaDetalleRepository ventaDetalleRepository;

    @Autowired
    VentaRepository ventaRepository;

    @Autowired
    SucursalRepository sucursalRepository;

    @Autowired
    MatrizRepository matrizRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    DomicilioRepository domicilioRepository;

    @Value("${osm.cfd.cerfile}")
    private String cerFile;

    @Value("${osm.cfd.keyfile}")
    private String keyFile;

    @Value("${osm.csd.keypass}")
    private String keypass;



    public void crearCFD(Venta venta) {
        String workingDir = System.getProperty("user.dir");
        String pathToKey = workingDir+keyFile;
        try {
            PrivateKey key = null;
            key = KeyLoaderFactory.createInstance(KeyLoaderEnumeration.PRIVATE_KEY_LOADER, new FileInputStream(pathToKey), keypass).getKey();

            X509Certificate cert = KeyLoaderFactory.createInstance(
                    KeyLoaderEnumeration.PUBLIC_KEY_LOADER,
                    new FileInputStream(workingDir+cerFile)
            ).getKey();
            CFDv32 cfdi = new CFDv32(createComprobante(venta), "mx.bigdata.sat.cfdi.examples");
            cfdi.addNamespace("http://www.bigdata.mx/cfdi/example", "example");


            mx.bigdata.sat.cfdi.v32.schema.Comprobante sellado = cfdi.sellarComprobante(key,cert);
            System.err.println(sellado.getSello());
            cfdi.validar();
            cfdi.verificar();
            cfdi.guardar(System.out);
        }catch(Exception ex){
            logger.debug(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public Comprobante createComprobante(Venta venta){

        ObjectFactory objectFactory = new ObjectFactory();

        Comprobante comprobante = objectFactory.createComprobante();
        //ComprobanteFiscal
        comprobante.setVersion("3.2");
        comprobante.setNoCertificado("CERTIFICADO");
        comprobante.setMetodoDePago(venta.getMetodoPago());
        comprobante.setFolio(venta.getFolio());
        comprobante.setFecha(venta.getFecha());
        comprobante.setCertificado("String Certificado");
        comprobante.setNumCtaPago("NumCta");
        comprobante.setTipoDeComprobante("ingreso");
        comprobante.setFormaDePago("Pago en una sola exhibición");
        comprobante.setEmisor(crearEmisor(objectFactory,venta));
        comprobante.setReceptor(crearReceptor(objectFactory,venta));
        comprobante.setConceptos(crearConceptos(objectFactory, venta));
        comprobante.setLugarExpedicion(comprobante.getEmisor().getDomicilioFiscal().getEstado()+" "+comprobante.getEmisor().getDomicilioFiscal().getPais());
        comprobante.setImpuestos(crearImpuestos(objectFactory, venta));
        comprobante.setSubTotal(venta.getSubtotal());
        comprobante.setDescuento(venta.getDescuento());
        comprobante.setTotal(venta.getTotal());
        comprobante.setMoneda("PESO MEXICANOS");

        //ComprobanteInfo
        ComprobanteInfo comprobanteInfo = new ComprobanteInfo();
        comprobanteInfo.setComprobante(comprobante);
        ComprobanteFiscal comprobanteFiscal = new ComprobanteFiscal();
        comprobanteFiscal.setComprobanteInfo(comprobanteInfo);

        try {
            comprobanteRepository.save(comprobanteFiscal);
        }catch (HibernateException ex){
            throw new HibernateException(ex);
        }
        return comprobante;
    }

    //Emisor
    private Comprobante.Emisor crearEmisor(ObjectFactory objectFactory, Venta venta){
        Sucursal sucursal = sucursalRepository.findOne(venta.getSucursal().getId());
        Comprobante.Emisor emisor = objectFactory.createComprobanteEmisor();
        Matriz matriz = matrizRepository.findOne(sucursal.getMatriz().getId());
        emisor.setNombre(matriz.getNombre());
        emisor.setRfc(matriz.getRfc());
        Comprobante.Emisor.RegimenFiscal regimenFiscal = objectFactory.createComprobanteEmisorRegimenFiscal();

        regimenFiscal.setRegimen(matriz.getRegimen());
        emisor.getRegimenFiscal().add(regimenFiscal);

        TUbicacionFiscal emisorUbicacionFiscal = new TUbicacionFiscal();
        emisorUbicacionFiscal.setCalle(sucursal.getCalle());
        emisorUbicacionFiscal.setCodigoPostal(sucursal.getCp());
        emisorUbicacionFiscal.setColonia(sucursal.getColonia());
        emisorUbicacionFiscal.setEstado(sucursal.getEstado());
        emisorUbicacionFiscal.setLocalidad(sucursal.getLocalidad());
        if(emisorUbicacionFiscal.getReferencia()!=null) {
            emisorUbicacionFiscal.setReferencia(sucursal.getReferencia());
        }
        emisorUbicacionFiscal.setMunicipio(sucursal.getMunicipio());
        emisorUbicacionFiscal.setNoExterior(sucursal.getNoExterior());
        if(emisorUbicacionFiscal.getNoInterior()!=null) {
            emisorUbicacionFiscal.setNoInterior(sucursal.getNoInterior());
        }
        emisorUbicacionFiscal.setPais(sucursal.getPais());
        emisor.setDomicilioFiscal(emisorUbicacionFiscal);
        return emisor;
    }

    //Receptor
    private Comprobante.Receptor crearReceptor(ObjectFactory objectFactory, Venta venta) {
        Cliente cliente = clienteRepository.findOne(venta.getCliente().getId());
        Domicilio domicilioCliente = domicilioRepository.findOne(venta.getDomicilioCliente().getId());
        Comprobante.Receptor receptor = objectFactory.createComprobanteReceptor();

        receptor.setNombre(cliente.getNombreCompleto());
        receptor.setRfc(cliente.getRfc());
        TUbicacion receptorUbicacionFiscal = objectFactory.createTUbicacion();

        receptorUbicacionFiscal.setCalle(domicilioCliente.getCalle());
        receptorUbicacionFiscal.setNoExterior(domicilioCliente.getNoExterior());
        if(receptorUbicacionFiscal.getNoInterior()!=null) {
            receptorUbicacionFiscal.setNoInterior(domicilioCliente.getNoInterior());
        }
        receptorUbicacionFiscal.setEstado(domicilioCliente.getEstado());
        receptorUbicacionFiscal.setPais(domicilioCliente.getPais());
        receptorUbicacionFiscal.setColonia(domicilioCliente.getColonia());
        receptorUbicacionFiscal.setCodigoPostal(domicilioCliente.getCodigoPostal());
        if(domicilioCliente.getReferencia()!=null) {
            receptorUbicacionFiscal.setReferencia(domicilioCliente.getReferencia());
        }
        receptor.setDomicilio(receptorUbicacionFiscal);
        return receptor;
    }

    //Conceptos
    private Comprobante.Conceptos crearConceptos(ObjectFactory objectFactory, Venta venta){
        Comprobante.Conceptos conceptos = objectFactory.createComprobanteConceptos();
        for(VentaDetalle ventaDetalle : venta.getVentaDetalleSet()){
            Comprobante.Conceptos.Concepto concepto = objectFactory.createComprobanteConceptosConcepto();
            List<Comprobante.Conceptos.Concepto> conceptoList = conceptos.getConcepto();
            concepto.setCantidad(ventaDetalle.getCantidad());
            concepto.setUnidad(ventaDetalle.getUnidad());
            concepto.setDescripcion(ventaDetalle.getDescripcion());
            concepto.setValorUnitario(ventaDetalle.getPrecioUnitario());
            concepto.setNoIdentificacion(ventaDetalle.getCodigo());
            concepto.setImporte(ventaDetalle.getImporte());
            conceptoList.add(concepto);
        }
        return conceptos;
    }

    //Impuestos Trasladados
    private Comprobante.Impuestos crearImpuestos(ObjectFactory objectFactory, Venta venta) {
        Comprobante.Impuestos.Traslados traslados = objectFactory.createComprobanteImpuestosTraslados();
        Comprobante.Impuestos.Traslados.Traslado traslado = objectFactory.createComprobanteImpuestosTrasladosTraslado();
        traslado.setImpuesto("IVA");
        traslado.setTasa(new BigDecimal(".16"));
        traslado.setImporte(venta.getIva());
        traslados.getTraslado().add(traslado);
        Comprobante.Impuestos impuestos = objectFactory.createComprobanteImpuestos();
        impuestos.setTraslados(traslados);
        impuestos.setTotalImpuestosTrasladados(venta.getIva());
        return impuestos;
    }

    private Comprobante.Complemento crearComplemento(ObjectFactory objectFactory, Venta venta){
        Comprobante.Complemento complemento = objectFactory.createComprobanteComplemento();
        TimbreFiscalDigital timbreFiscalDigital = objectFactory.createTimbreFiscalDigital();
        timbreFiscalDigital.setFechaTimbrado(new Date());
        return complemento;
    }


    public Venta saveVenta(Venta venta){
        Venta newVenta = ventaRepository.save(venta);

        for(VentaDetalle ventaDetalle : venta.getVentaDetalleSet()){
            ventaDetalle.setVenta(newVenta);
            ventaDetalle = ventaDetalleRepository.save(ventaDetalle);
        }
        return newVenta;
    }

    private String getSerieCertificado(String pathFile) {
        InputStream read = null;
        Date fechaActual = new Date();
        String serie = null;
        try {
            read = new FileInputStream(pathFile);
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(read);
            byte[] array = cert.getSerialNumber().toByteArray();
            if(cert.getNotAfter().after(fechaActual)){
                serie = new String(array);
            }else {
                serie = "Expiro el certificado";
            }
        } catch (CertificateException ex) {
            Logger.getLogger(VentaService.class.getName()).log(null, ex);
        } catch (FileNotFoundException ex1) {
            //JsfUtil.addErrorMessage("No se encontro el certificado y la llave");
            Logger.getLogger(VentaService.class.getName()).log(null, ex1);
        } finally {
            try {
                read.close();
            } catch (IOException ex) {
                Logger.getLogger(VentaService.class.getName()).log(null, ex);
            } catch (NullPointerException nex) {
                //JsfUtil.addErrorMessage("No se encontro el certificado y la llave");
                Logger.getLogger(VentaService.class.getName()).log(null, nex);
            }
        }
        return serie;
    }
}
