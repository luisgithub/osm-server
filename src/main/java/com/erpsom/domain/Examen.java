package com.erpsom.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/7/16.
 */
@Entity
@Table(name = "examen")
public class Examen {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "paciente", referencedColumnName = "id")
    private Paciente paciente;
    private Date fecha;
    private String observacion_externa;
    private String oftalmo_od;
    private String oftalmo_oi;
    private String querato_od;
    private String querato_oi;
    private String lejos_sl_od;
    private String lejos_sl_oi;
    private String lejos_sl_ao;
    private String cerca_sl_od;
    private String cerca_sl_oi;
    private String cerca_sl_ao;
    private String lejos_cl_od;
    private String lejos_cl_oi;
    private String lejos_cl_ao;
    private String cerca_cl_od;
    private String cerca_cl_oi;
    private String cerca_cl_ao;
    private String cap_vis_od;
    private String cap_vis_oi;
    private String cap_vis_ao;
    private String amp_acom_od;
    private String amp_acom_oi;
    private String pantalleo_lejos;
    private String pantalleo_cerca;
    private String hirshberg;
    private String ppc;
    private String luces_worth;
    private String motilidad;
    private String pupilas;
    private String conf_campo_h;
    private String conf_campo_v;
    private String retino_lejos_od;
    private String retino_lejos_od_av;
    private String retino_lejos_oi;
    private String retino_lejos_oi_av;
    private String retino_cerca_od;
    private String retino_cerca_oi;
    private String bicroma_od;
    private String bicroma_oi;
    private String cil_cruzado_od;
    private String cil_cruzado_oi;
    private String dom_ocular_od;
    private String dom_ocular_oi;
    private String refra_subj_ret_od;
    private String refra_subj_ret_oi;
    private String refra_ctrl_conver_od;
    private String refra_ctrl_conver_oi;
    private String refra_binocular_od;
    private String refra_binocular_oi;
    private String subjetivos_lejos_od;
    private String subjetivos_lejos_od_av;
    private String subjetivos_lejos_oi;
    private String subjetivos_lejos_oi_av;
    private String foria_lat_6cm;
    private String foria_lat_40cm;
    private String base_aguera;
    private String base_adentro;
    private String neg_hasta_borrar;
    private String pos_hasta_borrar;
    private String hipermetropia_abs;
    private String hipermetropia_manifiesta;
    private String hipermetropia_facultativa;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion_externa() {
        return observacion_externa;
    }

    public void setObservacion_externa(String observacion_externa) {
        this.observacion_externa = observacion_externa;
    }

    public String getOftalmo_od() {
        return oftalmo_od;
    }

    public void setOftalmo_od(String oftalmo_od) {
        this.oftalmo_od = oftalmo_od;
    }

    public String getOftalmo_oi() {
        return oftalmo_oi;
    }

    public void setOftalmo_oi(String oftalmo_oi) {
        this.oftalmo_oi = oftalmo_oi;
    }

    public String getQuerato_od() {
        return querato_od;
    }

    public void setQuerato_od(String querato_od) {
        this.querato_od = querato_od;
    }

    public String getQuerato_oi() {
        return querato_oi;
    }

    public void setQuerato_oi(String querato_oi) {
        this.querato_oi = querato_oi;
    }

    public String getLejos_sl_od() {
        return lejos_sl_od;
    }

    public void setLejos_sl_od(String lejos_sl_od) {
        this.lejos_sl_od = lejos_sl_od;
    }

    public String getLejos_sl_oi() {
        return lejos_sl_oi;
    }

    public void setLejos_sl_oi(String lejos_sl_oi) {
        this.lejos_sl_oi = lejos_sl_oi;
    }

    public String getLejos_sl_ao() {
        return lejos_sl_ao;
    }

    public void setLejos_sl_ao(String lejos_sl_ao) {
        this.lejos_sl_ao = lejos_sl_ao;
    }

    public String getCerca_sl_od() {
        return cerca_sl_od;
    }

    public void setCerca_sl_od(String cerca_sl_od) {
        this.cerca_sl_od = cerca_sl_od;
    }

    public String getCerca_sl_oi() {
        return cerca_sl_oi;
    }

    public void setCerca_sl_oi(String cerca_sl_oi) {
        this.cerca_sl_oi = cerca_sl_oi;
    }

    public String getCerca_sl_ao() {
        return cerca_sl_ao;
    }

    public void setCerca_sl_ao(String cerca_sl_ao) {
        this.cerca_sl_ao = cerca_sl_ao;
    }

    public String getLejos_cl_od() {
        return lejos_cl_od;
    }

    public void setLejos_cl_od(String lejos_cl_od) {
        this.lejos_cl_od = lejos_cl_od;
    }

    public String getLejos_cl_oi() {
        return lejos_cl_oi;
    }

    public void setLejos_cl_oi(String lejos_cl_oi) {
        this.lejos_cl_oi = lejos_cl_oi;
    }

    public String getLejos_cl_ao() {
        return lejos_cl_ao;
    }

    public void setLejos_cl_ao(String lejos_cl_ao) {
        this.lejos_cl_ao = lejos_cl_ao;
    }

    public String getCerca_cl_od() {
        return cerca_cl_od;
    }

    public void setCerca_cl_od(String cerca_cl_od) {
        this.cerca_cl_od = cerca_cl_od;
    }

    public String getCerca_cl_oi() {
        return cerca_cl_oi;
    }

    public void setCerca_cl_oi(String cerca_cl_oi) {
        this.cerca_cl_oi = cerca_cl_oi;
    }

    public String getCerca_cl_ao() {
        return cerca_cl_ao;
    }

    public void setCerca_cl_ao(String cerca_cl_ao) {
        this.cerca_cl_ao = cerca_cl_ao;
    }

    public String getCap_vis_od() {
        return cap_vis_od;
    }

    public void setCap_vis_od(String cap_vis_od) {
        this.cap_vis_od = cap_vis_od;
    }

    public String getCap_vis_oi() {
        return cap_vis_oi;
    }

    public void setCap_vis_oi(String cap_vis_oi) {
        this.cap_vis_oi = cap_vis_oi;
    }

    public String getCap_vis_ao() {
        return cap_vis_ao;
    }

    public void setCap_vis_ao(String cap_vis_ao) {
        this.cap_vis_ao = cap_vis_ao;
    }

    public String getAmp_acom_od() {
        return amp_acom_od;
    }

    public void setAmp_acom_od(String amp_acom_od) {
        this.amp_acom_od = amp_acom_od;
    }

    public String getAmp_acom_oi() {
        return amp_acom_oi;
    }

    public void setAmp_acom_oi(String amp_acom_oi) {
        this.amp_acom_oi = amp_acom_oi;
    }

    public String getPantalleo_lejos() {
        return pantalleo_lejos;
    }

    public void setPantalleo_lejos(String pantalleo_lejos) {
        this.pantalleo_lejos = pantalleo_lejos;
    }

    public String getPantalleo_cerca() {
        return pantalleo_cerca;
    }

    public void setPantalleo_cerca(String pantalleo_cerca) {
        this.pantalleo_cerca = pantalleo_cerca;
    }

    public String getHirshberg() {
        return hirshberg;
    }

    public void setHirshberg(String hirshberg) {
        this.hirshberg = hirshberg;
    }

    public String getPpc() {
        return ppc;
    }

    public void setPpc(String ppc) {
        this.ppc = ppc;
    }

    public String getLuces_worth() {
        return luces_worth;
    }

    public void setLuces_worth(String luces_worth) {
        this.luces_worth = luces_worth;
    }

    public String getMotilidad() {
        return motilidad;
    }

    public void setMotilidad(String motilidad) {
        this.motilidad = motilidad;
    }

    public String getPupilas() {
        return pupilas;
    }

    public void setPupilas(String pupilas) {
        this.pupilas = pupilas;
    }

    public String getConf_campo_h() {
        return conf_campo_h;
    }

    public void setConf_campo_h(String conf_campo_h) {
        this.conf_campo_h = conf_campo_h;
    }

    public String getConf_campo_v() {
        return conf_campo_v;
    }

    public void setConf_campo_v(String conf_campo_v) {
        this.conf_campo_v = conf_campo_v;
    }

    public String getRetino_lejos_od() {
        return retino_lejos_od;
    }

    public void setRetino_lejos_od(String retino_lejos_od) {
        this.retino_lejos_od = retino_lejos_od;
    }

    public String getRetino_lejos_od_av() {
        return retino_lejos_od_av;
    }

    public void setRetino_lejos_od_av(String retino_lejos_od_av) {
        this.retino_lejos_od_av = retino_lejos_od_av;
    }

    public String getRetino_lejos_oi() {
        return retino_lejos_oi;
    }

    public void setRetino_lejos_oi(String retino_lejos_oi) {
        this.retino_lejos_oi = retino_lejos_oi;
    }

    public String getRetino_lejos_oi_av() {
        return retino_lejos_oi_av;
    }

    public void setRetino_lejos_oi_av(String retino_lejos_oi_av) {
        this.retino_lejos_oi_av = retino_lejos_oi_av;
    }

    public String getRetino_cerca_od() {
        return retino_cerca_od;
    }

    public void setRetino_cerca_od(String retino_cerca_od) {
        this.retino_cerca_od = retino_cerca_od;
    }

    public String getRetino_cerca_oi() {
        return retino_cerca_oi;
    }

    public void setRetino_cerca_oi(String retino_cerca_oi) {
        this.retino_cerca_oi = retino_cerca_oi;
    }

    public String getBicroma_od() {
        return bicroma_od;
    }

    public void setBicroma_od(String bicroma_od) {
        this.bicroma_od = bicroma_od;
    }

    public String getBicroma_oi() {
        return bicroma_oi;
    }

    public void setBicroma_oi(String bicroma_oi) {
        this.bicroma_oi = bicroma_oi;
    }

    public String getCil_cruzado_od() {
        return cil_cruzado_od;
    }

    public void setCil_cruzado_od(String cil_cruzado_od) {
        this.cil_cruzado_od = cil_cruzado_od;
    }

    public String getCil_cruzado_oi() {
        return cil_cruzado_oi;
    }

    public void setCil_cruzado_oi(String cil_cruzado_oi) {
        this.cil_cruzado_oi = cil_cruzado_oi;
    }

    public String getDom_ocular_od() {
        return dom_ocular_od;
    }

    public void setDom_ocular_od(String dom_ocular_od) {
        this.dom_ocular_od = dom_ocular_od;
    }

    public String getDom_ocular_oi() {
        return dom_ocular_oi;
    }

    public void setDom_ocular_oi(String dom_ocular_oi) {
        this.dom_ocular_oi = dom_ocular_oi;
    }

    public String getRefra_subj_ret_od() {
        return refra_subj_ret_od;
    }

    public void setRefra_subj_ret_od(String refra_subj_ret_od) {
        this.refra_subj_ret_od = refra_subj_ret_od;
    }

    public String getRefra_subj_ret_oi() {
        return refra_subj_ret_oi;
    }

    public void setRefra_subj_ret_oi(String refra_subj_ret_oi) {
        this.refra_subj_ret_oi = refra_subj_ret_oi;
    }

    public String getRefra_ctrl_conver_od() {
        return refra_ctrl_conver_od;
    }

    public void setRefra_ctrl_conver_od(String refra_ctrl_conver_od) {
        this.refra_ctrl_conver_od = refra_ctrl_conver_od;
    }

    public String getRefra_ctrl_conver_oi() {
        return refra_ctrl_conver_oi;
    }

    public void setRefra_ctrl_conver_oi(String refra_ctrl_conver_oi) {
        this.refra_ctrl_conver_oi = refra_ctrl_conver_oi;
    }

    public String getRefra_binocular_od() {
        return refra_binocular_od;
    }

    public void setRefra_binocular_od(String refra_binocular_od) {
        this.refra_binocular_od = refra_binocular_od;
    }

    public String getRefra_binocular_oi() {
        return refra_binocular_oi;
    }

    public void setRefra_binocular_oi(String refra_binocular_oi) {
        this.refra_binocular_oi = refra_binocular_oi;
    }

    public String getSubjetivos_lejos_od() {
        return subjetivos_lejos_od;
    }

    public void setSubjetivos_lejos_od(String subjetivos_lejos_od) {
        this.subjetivos_lejos_od = subjetivos_lejos_od;
    }

    public String getSubjetivos_lejos_od_av() {
        return subjetivos_lejos_od_av;
    }

    public void setSubjetivos_lejos_od_av(String subjetivos_lejos_od_av) {
        this.subjetivos_lejos_od_av = subjetivos_lejos_od_av;
    }

    public String getSubjetivos_lejos_oi() {
        return subjetivos_lejos_oi;
    }

    public void setSubjetivos_lejos_oi(String subjetivos_lejos_oi) {
        this.subjetivos_lejos_oi = subjetivos_lejos_oi;
    }

    public String getSubjetivos_lejos_oi_av() {
        return subjetivos_lejos_oi_av;
    }

    public void setSubjetivos_lejos_oi_av(String subjetivos_lejos_oi_av) {
        this.subjetivos_lejos_oi_av = subjetivos_lejos_oi_av;
    }

    public String getForia_lat_6cm() {
        return foria_lat_6cm;
    }

    public void setForia_lat_6cm(String foria_lat_6cm) {
        this.foria_lat_6cm = foria_lat_6cm;
    }

    public String getForia_lat_40cm() {
        return foria_lat_40cm;
    }

    public void setForia_lat_40cm(String foria_lat_40cm) {
        this.foria_lat_40cm = foria_lat_40cm;
    }

    public String getBase_aguera() {
        return base_aguera;
    }

    public void setBase_aguera(String base_aguera) {
        this.base_aguera = base_aguera;
    }

    public String getBase_adentro() {
        return base_adentro;
    }

    public void setBase_adentro(String base_adentro) {
        this.base_adentro = base_adentro;
    }

    public String getNeg_hasta_borrar() {
        return neg_hasta_borrar;
    }

    public void setNeg_hasta_borrar(String neg_hasta_borrar) {
        this.neg_hasta_borrar = neg_hasta_borrar;
    }

    public String getPos_hasta_borrar() {
        return pos_hasta_borrar;
    }

    public void setPos_hasta_borrar(String pos_hasta_borrar) {
        this.pos_hasta_borrar = pos_hasta_borrar;
    }

    public String getHipermetropia_abs() {
        return hipermetropia_abs;
    }

    public void setHipermetropia_abs(String hipermetropia_abs) {
        this.hipermetropia_abs = hipermetropia_abs;
    }

    public String getHipermetropia_manifiesta() {
        return hipermetropia_manifiesta;
    }

    public void setHipermetropia_manifiesta(String hipermetropia_manifiesta) {
        this.hipermetropia_manifiesta = hipermetropia_manifiesta;
    }

    public String getHipermetropia_facultativa() {
        return hipermetropia_facultativa;
    }

    public void setHipermetropia_facultativa(String hipermetropia_facultativa) {
        this.hipermetropia_facultativa = hipermetropia_facultativa;
    }
}
