package com.erpsom.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/10/16.
 */

@Entity
@Table(name = "municipio")
public class Municipio {

    @Id
    private String clave;
    private String nombre;
    private String clave_cabecera;
    private String nombre_cabecera;
    @Temporal(TemporalType.DATE)
    private Date fecha_modificacion;
    private String entidad;

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

    public String getClave_cabecera() {
        return clave_cabecera;
    }

    public void setClave_cabecera(String clave_cabecera) {
        this.clave_cabecera = clave_cabecera;
    }

    public String getNombre_cabecera() {
        return nombre_cabecera;
    }

    public void setNombre_cabecera(String nombre_cabecera) {
        this.nombre_cabecera = nombre_cabecera;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
}
