package com.erpsom.domain.json;

import mx.bigdata.sat.cfdi.v32.schema.Comprobante;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/16/17.
 */
public class ComprobanteInfo {
    private Comprobante comprobante;
//    private String version;
//    private String noCertificado;
//    private String metodoPago;
//    private String folio;
//    private Date fecha;
//    private String certificado;
//    private String numCtaCertificado;
//    private String tipoComprobante;
//    private String formaDePago;
//    private String lugarDeExpedicion;
//    private String emisorNombre;
//    private String emisorRfc;
//    private String emisorRegimen;
//    private String emisorCalle;
//    private String emisorColonia;
//    private String emisorCodigoPostal;
//    private String emisorEstado;
//    private String emisorLocalidad;
//    private String emisorReferencia;
//    private String emisorMunicipio;
//    private String emisorNoExterior;
//    private String emisorNoInterior;
//    private String emisorPais;
//    private String receptorNombre;
//    private String receptorRfc;
//    private String receptorCalle;
//    private String receptorColonia;
//    private String receptorCodigoPostal;
//    private String receptorEstado;
//    private String receptorMunicipio;
//    private String receptorLocalidad;
//    private String receptorPais;
//    private String receptorReferencia;
//    private List<ConceptoVenta> conceptoVentaList;
//    private String impuestoNombre;
//    private String impuestoTasa;
//    private BigDecimal impuestoImporte;
//    private BigDecimal subtotal;
//    private BigDecimal descuento;
//    private BigDecimal total;

    public ComprobanteInfo() {
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }
}
