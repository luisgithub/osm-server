package com.erpsom.domain.json;

import java.util.Date;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/16/17.
 */
public class ComprobanteInfo {
    private String version;
    private String noCertificado;
    private String metodoPago;
    private String folio;
    private Date fecha;

    public ComprobanteInfo() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNoCertificado() {
        return noCertificado;
    }

    public void setNoCertificado(String noCertificado) {
        this.noCertificado = noCertificado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComprobanteInfo comprobanteInfo = (ComprobanteInfo) o;

        if (version != comprobanteInfo.version) return false;
        if (noCertificado != null ? !noCertificado.equals(comprobanteInfo.noCertificado) : comprobanteInfo.noCertificado != null) return false;
        return !(folio != null ? !folio.equals(comprobanteInfo.folio) : comprobanteInfo.folio != null);

    }

    @Override
    public int hashCode() {
        int result = folio != null ? folio.hashCode() : 0;
        result = 31 * result + Integer.valueOf(version);
        result = 31 * result + (noCertificado != null ? noCertificado.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "comprobanteInfo{" +
                "version='" + version + '\'' +
                ", folio=" + folio +
                ", noCertificado='" + noCertificado + '\'' +
                '}';
    }

}
