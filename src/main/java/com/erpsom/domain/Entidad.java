package com.erpsom.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/10/16.
 */

@Entity
@Table(name = "entidad")
public class Entidad {

    @Id
    private String clave;
    private String nombre;
    private String abreviacion;
    @Temporal(TemporalType.DATE)
    private Date fecha_modificacion;
    private String pais;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
