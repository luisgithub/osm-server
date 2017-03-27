package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMatriz is a Querydsl query type for Matriz
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMatriz extends EntityPathBase<Matriz> {

    private static final long serialVersionUID = -109713926L;

    public static final QMatriz matriz = new QMatriz("matriz");

    public final StringPath calle = createString("calle");

    public final StringPath colonia = createString("colonia");

    public final StringPath correo = createString("correo");

    public final StringPath cp = createString("cp");

    public final StringPath estado = createString("estado");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath localidad = createString("localidad");

    public final StringPath municipio = createString("municipio");

    public final StringPath noExterior = createString("noExterior");

    public final StringPath noInterior = createString("noInterior");

    public final StringPath nombre = createString("nombre");

    public final StringPath pais = createString("pais");

    public final StringPath referencia = createString("referencia");

    public final StringPath regimen = createString("regimen");

    public final StringPath rfc = createString("rfc");

    public final StringPath telefono1 = createString("telefono1");

    public final StringPath telefono2 = createString("telefono2");

    public QMatriz(String variable) {
        super(Matriz.class, forVariable(variable));
    }

    public QMatriz(Path<? extends Matriz> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMatriz(PathMetadata metadata) {
        super(Matriz.class, metadata);
    }

}

