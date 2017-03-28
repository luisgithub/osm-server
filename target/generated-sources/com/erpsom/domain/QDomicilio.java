package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDomicilio is a Querydsl query type for Domicilio
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDomicilio extends EntityPathBase<Domicilio> {

    private static final long serialVersionUID = -186889266L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDomicilio domicilio = new QDomicilio("domicilio");

    public final StringPath calle = createString("calle");

    public final QCliente cliente;

    public final StringPath codigoPostal = createString("codigoPostal");

    public final StringPath colonia = createString("colonia");

    public final StringPath estado = createString("estado");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath localidad = createString("localidad");

    public final StringPath municipio = createString("municipio");

    public final StringPath noExterior = createString("noExterior");

    public final StringPath noInterior = createString("noInterior");

    public final StringPath pais = createString("pais");

    public final StringPath referencia = createString("referencia");

    public QDomicilio(String variable) {
        this(Domicilio.class, forVariable(variable), INITS);
    }

    public QDomicilio(Path<? extends Domicilio> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDomicilio(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDomicilio(PathMetadata metadata, PathInits inits) {
        this(Domicilio.class, metadata, inits);
    }

    public QDomicilio(Class<? extends Domicilio> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QCliente(forProperty("cliente")) : null;
    }

}

