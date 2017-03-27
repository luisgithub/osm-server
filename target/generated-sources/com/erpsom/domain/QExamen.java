package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExamen is a Querydsl query type for Examen
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExamen extends EntityPathBase<Examen> {

    private static final long serialVersionUID = -318077121L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExamen examen = new QExamen("examen");

    public final StringPath amp_acom_od = createString("amp_acom_od");

    public final StringPath amp_acom_oi = createString("amp_acom_oi");

    public final StringPath base_adentro = createString("base_adentro");

    public final StringPath base_aguera = createString("base_aguera");

    public final StringPath bicroma_od = createString("bicroma_od");

    public final StringPath bicroma_oi = createString("bicroma_oi");

    public final StringPath cap_vis_ao = createString("cap_vis_ao");

    public final StringPath cap_vis_od = createString("cap_vis_od");

    public final StringPath cap_vis_oi = createString("cap_vis_oi");

    public final StringPath cerca_cl_ao = createString("cerca_cl_ao");

    public final StringPath cerca_cl_od = createString("cerca_cl_od");

    public final StringPath cerca_cl_oi = createString("cerca_cl_oi");

    public final StringPath cerca_sl_ao = createString("cerca_sl_ao");

    public final StringPath cerca_sl_od = createString("cerca_sl_od");

    public final StringPath cerca_sl_oi = createString("cerca_sl_oi");

    public final StringPath cil_cruzado_od = createString("cil_cruzado_od");

    public final StringPath cil_cruzado_oi = createString("cil_cruzado_oi");

    public final StringPath conf_campo_h = createString("conf_campo_h");

    public final StringPath conf_campo_v = createString("conf_campo_v");

    public final StringPath dom_ocular_od = createString("dom_ocular_od");

    public final StringPath dom_ocular_oi = createString("dom_ocular_oi");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final StringPath foria_lat_40cm = createString("foria_lat_40cm");

    public final StringPath foria_lat_6cm = createString("foria_lat_6cm");

    public final StringPath hipermetropia_abs = createString("hipermetropia_abs");

    public final StringPath hipermetropia_facultativa = createString("hipermetropia_facultativa");

    public final StringPath hipermetropia_manifiesta = createString("hipermetropia_manifiesta");

    public final StringPath hirshberg = createString("hirshberg");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lejos_cl_ao = createString("lejos_cl_ao");

    public final StringPath lejos_cl_od = createString("lejos_cl_od");

    public final StringPath lejos_cl_oi = createString("lejos_cl_oi");

    public final StringPath lejos_sl_ao = createString("lejos_sl_ao");

    public final StringPath lejos_sl_od = createString("lejos_sl_od");

    public final StringPath lejos_sl_oi = createString("lejos_sl_oi");

    public final StringPath luces_worth = createString("luces_worth");

    public final StringPath motilidad = createString("motilidad");

    public final StringPath neg_hasta_borrar = createString("neg_hasta_borrar");

    public final StringPath observacion_externa = createString("observacion_externa");

    public final StringPath oftalmo_od = createString("oftalmo_od");

    public final StringPath oftalmo_oi = createString("oftalmo_oi");

    public final QPaciente paciente;

    public final StringPath pantalleo_cerca = createString("pantalleo_cerca");

    public final StringPath pantalleo_lejos = createString("pantalleo_lejos");

    public final StringPath pos_hasta_borrar = createString("pos_hasta_borrar");

    public final StringPath ppc = createString("ppc");

    public final StringPath pupilas = createString("pupilas");

    public final StringPath querato_od = createString("querato_od");

    public final StringPath querato_oi = createString("querato_oi");

    public final StringPath refra_binocular_od = createString("refra_binocular_od");

    public final StringPath refra_binocular_oi = createString("refra_binocular_oi");

    public final StringPath refra_ctrl_conver_od = createString("refra_ctrl_conver_od");

    public final StringPath refra_ctrl_conver_oi = createString("refra_ctrl_conver_oi");

    public final StringPath refra_subj_ret_od = createString("refra_subj_ret_od");

    public final StringPath refra_subj_ret_oi = createString("refra_subj_ret_oi");

    public final StringPath retino_cerca_od = createString("retino_cerca_od");

    public final StringPath retino_cerca_oi = createString("retino_cerca_oi");

    public final StringPath retino_lejos_od = createString("retino_lejos_od");

    public final StringPath retino_lejos_od_av = createString("retino_lejos_od_av");

    public final StringPath retino_lejos_oi = createString("retino_lejos_oi");

    public final StringPath retino_lejos_oi_av = createString("retino_lejos_oi_av");

    public final StringPath subjetivos_lejos_od = createString("subjetivos_lejos_od");

    public final StringPath subjetivos_lejos_od_av = createString("subjetivos_lejos_od_av");

    public final StringPath subjetivos_lejos_oi = createString("subjetivos_lejos_oi");

    public final StringPath subjetivos_lejos_oi_av = createString("subjetivos_lejos_oi_av");

    public QExamen(String variable) {
        this(Examen.class, forVariable(variable), INITS);
    }

    public QExamen(Path<? extends Examen> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExamen(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExamen(PathMetadata metadata, PathInits inits) {
        this(Examen.class, metadata, inits);
    }

    public QExamen(Class<? extends Examen> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.paciente = inits.isInitialized("paciente") ? new QPaciente(forProperty("paciente")) : null;
    }

}

