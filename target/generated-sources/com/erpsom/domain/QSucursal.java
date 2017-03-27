package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSucursal is a Querydsl query type for Sucursal
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSucursal extends EntityPathBase<Sucursal> {

    private static final long serialVersionUID = -402396425L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSucursal sucursal = new QSucursal("sucursal");

    public final StringPath calle = createString("calle");

    public final StringPath colonia = createString("colonia");

    public final StringPath correo = createString("correo");

    public final StringPath cp = createString("cp");

    public final StringPath estado = createString("estado");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath localidad = createString("localidad");

    public final QMatriz matriz;

    public final StringPath municipio = createString("municipio");

    public final StringPath noExterior = createString("noExterior");

    public final StringPath noInterior = createString("noInterior");

    public final StringPath pais = createString("pais");

    public final StringPath referencia = createString("referencia");

    public final StringPath telefono1 = createString("telefono1");

    public final StringPath telefono2 = createString("telefono2");

    public QSucursal(String variable) {
        this(Sucursal.class, forVariable(variable), INITS);
    }

    public QSucursal(Path<? extends Sucursal> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSucursal(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSucursal(PathMetadata metadata, PathInits inits) {
        this(Sucursal.class, metadata, inits);
    }

    public QSucursal(Class<? extends Sucursal> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.matriz = inits.isInitialized("matriz") ? new QMatriz(forProperty("matriz")) : null;
    }

}

