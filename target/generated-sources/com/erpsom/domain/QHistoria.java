package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHistoria is a Querydsl query type for Historia
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHistoria extends EntityPathBase<Historia> {

    private static final long serialVersionUID = 298469588L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHistoria historia = new QHistoria("historia");

    public final StringPath accidentes = createString("accidentes");

    public final BooleanPath ardor_cl = createBoolean("ardor_cl");

    public final BooleanPath ardor_sl = createBoolean("ardor_sl");

    public final BooleanPath borroso_cerca_cl = createBoolean("borroso_cerca_cl");

    public final BooleanPath borroso_cerca_sl = createBoolean("borroso_cerca_sl");

    public final BooleanPath borroso_lejos_cl = createBoolean("borroso_lejos_cl");

    public final BooleanPath borroso_lejos_sl = createBoolean("borroso_lejos_sl");

    public final BooleanPath comezon_cl = createBoolean("comezon_cl");

    public final BooleanPath comezon_sl = createBoolean("comezon_sl");

    public final BooleanPath dolor_cabeza_cl = createBoolean("dolor_cabeza_cl");

    public final BooleanPath dolor_cabeza_sl = createBoolean("dolor_cabeza_sl");

    public final BooleanPath dolor_ocular_cl = createBoolean("dolor_ocular_cl");

    public final BooleanPath dolor_ocular_sl = createBoolean("dolor_ocular_sl");

    public final StringPath edad = createString("edad");

    public final StringPath estado_salud = createString("estado_salud");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath lagrimeo_cl = createBoolean("lagrimeo_cl");

    public final BooleanPath lagrimeo_sl = createBoolean("lagrimeo_sl");

    public final BooleanPath leer_brinca_reng_cl = createBoolean("leer_brinca_reng_cl");

    public final BooleanPath leer_brinca_reng_sl = createBoolean("leer_brinca_reng_sl");

    public final StringPath medicametos = createString("medicametos");

    public final BooleanPath molesta_luz_cl = createBoolean("molesta_luz_cl");

    public final BooleanPath molesta_luz_sl = createBoolean("molesta_luz_sl");

    public final StringPath ocupacion = createString("ocupacion");

    public final BooleanPath ojos_resecos_cl = createBoolean("ojos_resecos_cl");

    public final BooleanPath ojos_resecos_sl = createBoolean("ojos_resecos_sl");

    public final BooleanPath ojos_rojos_cl = createBoolean("ojos_rojos_cl");

    public final BooleanPath ojos_rojos_sl = createBoolean("ojos_rojos_sl");

    public final QPaciente paciente;

    public final StringPath pasatiempos = createString("pasatiempos");

    public final StringPath preferencia = createString("preferencia");

    public final BooleanPath sensacion_dentro_cl = createBoolean("sensacion_dentro_cl");

    public final BooleanPath sensacion_dentro_sl = createBoolean("sensacion_dentro_sl");

    public final StringPath ultima_adaptacion = createString("ultima_adaptacion");

    public QHistoria(String variable) {
        this(Historia.class, forVariable(variable), INITS);
    }

    public QHistoria(Path<? extends Historia> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHistoria(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHistoria(PathMetadata metadata, PathInits inits) {
        this(Historia.class, metadata, inits);
    }

    public QHistoria(Class<? extends Historia> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.paciente = inits.isInitialized("paciente") ? new QPaciente(forProperty("paciente")) : null;
    }

}

