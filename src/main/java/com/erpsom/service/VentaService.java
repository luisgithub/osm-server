package com.erpsom.service;

import com.erpsom.domain.*;
import com.erpsom.domain.json.ComprobanteInfo;
import com.erpsom.repository.*;
import mx.bigdata.sat.cfdi.v32.schema.Comprobante;
import mx.bigdata.sat.cfdi.v32.schema.TUbicacion;
import mx.bigdata.sat.cfdi.v32.schema.TUbicacionFiscal;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VentaService {

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

    public Comprobante crateComprobante(Venta venta){
        Comprobante comprobante = new Comprobante();
        //Comprobante
        comprobante.setVersion("3.2");
        comprobante.setNoCertificado("00001000000303180555");
        comprobante.setMetodoDePago(venta.getMetodoPago());
        comprobante.setFolio(venta.getFolio());
        comprobante.setFecha(venta.getFecha());
        //Emisor
        Comprobante.Emisor emisor = new Comprobante.Emisor();

        Sucursal sucursal = sucursalRepository.findOne(venta.getSucursal().getId());
        Matriz matriz = matrizRepository.findOne(sucursal.getMatriz().getId());
        emisor.setNombre(matriz.getNombre());
        emisor.setRfc(matriz.getRfc());
        Comprobante.Emisor.RegimenFiscal regimenFiscal = new Comprobante.Emisor.RegimenFiscal();

        regimenFiscal.setRegimen(matriz.getRegimen());
        emisor.getRegimenFiscal().add(regimenFiscal);

        TUbicacionFiscal emisorUbicacionFiscal = new TUbicacionFiscal();
        emisorUbicacionFiscal.setCalle(sucursal.getCalle());
        emisorUbicacionFiscal.setCodigoPostal(sucursal.getCp());
        emisorUbicacionFiscal.setColonia(sucursal.getColonia());
        emisorUbicacionFiscal.setEstado(sucursal.getEstado());
        emisorUbicacionFiscal.setLocalidad(sucursal.getLocalidad());
        emisorUbicacionFiscal.setReferencia(sucursal.getReferencia());
        emisorUbicacionFiscal.setMunicipio(sucursal.getMunicipio());
        emisorUbicacionFiscal.setNoExterior(sucursal.getNoExterior());
        emisorUbicacionFiscal.setNoInterior(sucursal.getNoInterior());
        emisorUbicacionFiscal.setPais(sucursal.getPais());
        emisor.setDomicilioFiscal(emisorUbicacionFiscal);
        comprobante.setEmisor(emisor);
        //Receptor
        Comprobante.Receptor receptor = new Comprobante.Receptor();
        Cliente cliente = clienteRepository.findOne(venta.getCliente().getId());
        receptor.setNombre(cliente.getNombreCompleto());
        receptor.setRfc(cliente.getRfc());
        TUbicacion receptorUbicacionFiscal = new TUbicacion();
        Domicilio domicilioCliente = domicilioRepository.findOne(venta.getDomicilioCliente().getId());
        receptorUbicacionFiscal.setCalle(domicilioCliente.getCalle());
        receptorUbicacionFiscal.setNoExterior(domicilioCliente.getNoExterior());
        receptorUbicacionFiscal.setNoInterior(domicilioCliente.getNoInterior());
        receptorUbicacionFiscal.setEstado(domicilioCliente.getEstado());
        receptorUbicacionFiscal.setPais(domicilioCliente.getPais());
        receptorUbicacionFiscal.setColonia(domicilioCliente.getColonia());
        receptorUbicacionFiscal.setCodigoPostal(domicilioCliente.getCodigoPostal());
        receptorUbicacionFiscal.setReferencia(domicilioCliente.getReferencia());
        receptor.setDomicilio(receptorUbicacionFiscal);

        try {
            ComprobanteInfo comprobanteInfo = new ComprobanteInfo();
            comprobanteInfo.setFecha(comprobante.getFecha());
            comprobanteInfo.setFolio(comprobante.getFolio());
            comprobanteInfo.setMetodoPago(comprobanteInfo.getMetodoPago());
            comprobanteInfo.setNoCertificado(comprobante.getNoCertificado());
            comprobanteInfo.setVersion(comprobante.getVersion());
            com.erpsom.domain.Comprobante comprobanteFiscal = new com.erpsom.domain.Comprobante();
            comprobanteFiscal.setComprobanteInfo(comprobanteInfo);
            comprobanteRepository.save(comprobanteFiscal);
        }catch (HibernateException ex){
            throw new HibernateException(ex);
        }
        return comprobante;
    }

//    public Comprobante saveOrUpdateComprobante(Comprobante comprobante){
//        try {
//            comprobante = comprobanteRepository.save(comprobante);
//        }catch (HibernateException ex){
//            throw new HibernateException(ex);
//        }
//        return comprobante;
//    }


    public Venta saveVenta(Venta venta){
        Venta newVenta = ventaRepository.save(venta);

        for(VentaDetalle ventaDetalle : venta.getVentaDetalleSet()){
            ventaDetalle.setVenta(newVenta);
            ventaDetalle = ventaDetalleRepository.save(ventaDetalle);
        }
        return newVenta;
    }
}
