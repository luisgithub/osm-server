package com.erpsom.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/7/16.
 */
@Entity
@Table(name = "historia")
public class Historia {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "paciente", referencedColumnName = "id")
    private Paciente paciente;
    private String estado_salud;
    private String edad;
    private String ocupacion;
    private String pasatiempos;
    private String accidentes;
    private String medicametos;
    private String ultima_adaptacion;
    private String preferencia;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean borroso_lejos_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean borroso_lejos_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean borroso_cerca_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean borroso_cerca_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean ardor_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean ardor_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean comezon_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean comezon_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean ojos_rojos_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean ojos_rojos_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean ojos_resecos_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean ojos_resecos_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean dolor_cabeza_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean dolor_cabeza_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean leer_brinca_reng_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean leer_brinca_reng_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean sensacion_dentro_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean sensacion_dentro_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean molesta_luz_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean molesta_luz_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean lagrimeo_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean lagrimeo_sl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean dolor_ocular_cl;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean dolor_ocular_sl;

    public Historia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEstado_salud() {
        return estado_salud;
    }

    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPasatiempos() {
        return pasatiempos;
    }

    public void setPasatiempos(String pasatiempos) {
        this.pasatiempos = pasatiempos;
    }

    public String getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(String accidentes) {
        this.accidentes = accidentes;
    }

    public String getMedicametos() {
        return medicametos;
    }

    public void setMedicametos(String medicametos) {
        this.medicametos = medicametos;
    }

    public String getUltima_adaptacion() {
        return ultima_adaptacion;
    }

    public void setUltima_adaptacion(String ultima_adaptacion) {
        this.ultima_adaptacion = ultima_adaptacion;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public boolean isBorroso_lejos_cl() {
        return borroso_lejos_cl;
    }

    public void setBorroso_lejos_cl(boolean borroso_lejos_cl) {
        this.borroso_lejos_cl = borroso_lejos_cl;
    }

    public boolean isBorroso_lejos_sl() {
        return borroso_lejos_sl;
    }

    public void setBorroso_lejos_sl(boolean borroso_lejos_sl) {
        this.borroso_lejos_sl = borroso_lejos_sl;
    }

    public boolean isBorroso_cerca_cl() {
        return borroso_cerca_cl;
    }

    public void setBorroso_cerca_cl(boolean borroso_cerca_cl) {
        this.borroso_cerca_cl = borroso_cerca_cl;
    }

    public boolean isBorroso_cerca_sl() {
        return borroso_cerca_sl;
    }

    public void setBorroso_cerca_sl(boolean borroso_cerca_sl) {
        this.borroso_cerca_sl = borroso_cerca_sl;
    }

    public boolean isArdor_cl() {
        return ardor_cl;
    }

    public void setArdor_cl(boolean ardor_cl) {
        this.ardor_cl = ardor_cl;
    }

    public boolean isArdor_sl() {
        return ardor_sl;
    }

    public void setArdor_sl(boolean ardor_sl) {
        this.ardor_sl = ardor_sl;
    }

    public boolean isComezon_cl() {
        return comezon_cl;
    }

    public void setComezon_cl(boolean comezon_cl) {
        this.comezon_cl = comezon_cl;
    }

    public boolean isComezon_sl() {
        return comezon_sl;
    }

    public void setComezon_sl(boolean comezon_sl) {
        this.comezon_sl = comezon_sl;
    }

    public boolean isOjos_rojos_cl() {
        return ojos_rojos_cl;
    }

    public void setOjos_rojos_cl(boolean ojos_rojos_cl) {
        this.ojos_rojos_cl = ojos_rojos_cl;
    }

    public boolean isOjos_rojos_sl() {
        return ojos_rojos_sl;
    }

    public void setOjos_rojos_sl(boolean ojos_rojos_sl) {
        this.ojos_rojos_sl = ojos_rojos_sl;
    }

    public boolean isOjos_resecos_cl() {
        return ojos_resecos_cl;
    }

    public void setOjos_resecos_cl(boolean ojos_resecos_cl) {
        this.ojos_resecos_cl = ojos_resecos_cl;
    }

    public boolean isOjos_resecos_sl() {
        return ojos_resecos_sl;
    }

    public void setOjos_resecos_sl(boolean ojos_resecos_sl) {
        this.ojos_resecos_sl = ojos_resecos_sl;
    }

    public boolean isDolor_cabeza_cl() {
        return dolor_cabeza_cl;
    }

    public void setDolor_cabeza_cl(boolean dolor_cabeza_cl) {
        this.dolor_cabeza_cl = dolor_cabeza_cl;
    }

    public boolean isDolor_cabeza_sl() {
        return dolor_cabeza_sl;
    }

    public void setDolor_cabeza_sl(boolean dolor_cabeza_sl) {
        this.dolor_cabeza_sl = dolor_cabeza_sl;
    }

    public boolean isLeer_brinca_reng_cl() {
        return leer_brinca_reng_cl;
    }

    public void setLeer_brinca_reng_cl(boolean leer_brinca_reng_cl) {
        this.leer_brinca_reng_cl = leer_brinca_reng_cl;
    }

    public boolean isLeer_brinca_reng_sl() {
        return leer_brinca_reng_sl;
    }

    public void setLeer_brinca_reng_sl(boolean leer_brinca_reng_sl) {
        this.leer_brinca_reng_sl = leer_brinca_reng_sl;
    }

    public boolean isSensacion_dentro_cl() {
        return sensacion_dentro_cl;
    }

    public void setSensacion_dentro_cl(boolean sensacion_dentro_cl) {
        this.sensacion_dentro_cl = sensacion_dentro_cl;
    }

    public boolean isSensacion_dentro_sl() {
        return sensacion_dentro_sl;
    }

    public void setSensacion_dentro_sl(boolean sensacion_dentro_sl) {
        this.sensacion_dentro_sl = sensacion_dentro_sl;
    }

    public boolean isMolesta_luz_cl() {
        return molesta_luz_cl;
    }

    public void setMolesta_luz_cl(boolean molesta_luz_cl) {
        this.molesta_luz_cl = molesta_luz_cl;
    }

    public boolean isMolesta_luz_sl() {
        return molesta_luz_sl;
    }

    public void setMolesta_luz_sl(boolean molesta_luz_sl) {
        this.molesta_luz_sl = molesta_luz_sl;
    }

    public boolean isLagrimeo_cl() {
        return lagrimeo_cl;
    }

    public void setLagrimeo_cl(boolean lagrimeo_cl) {
        this.lagrimeo_cl = lagrimeo_cl;
    }

    public boolean isLagrimeo_sl() {
        return lagrimeo_sl;
    }

    public void setLagrimeo_sl(boolean lagrimeo_sl) {
        this.lagrimeo_sl = lagrimeo_sl;
    }

    public boolean isDolor_ocular_cl() {
        return dolor_ocular_cl;
    }

    public void setDolor_ocular_cl(boolean dolor_ocular_cl) {
        this.dolor_ocular_cl = dolor_ocular_cl;
    }

    public boolean isDolor_ocular_sl() {
        return dolor_ocular_sl;
    }

    public void setDolor_ocular_sl(boolean dolor_ocular_sl) {
        this.dolor_ocular_sl = dolor_ocular_sl;
    }
}

