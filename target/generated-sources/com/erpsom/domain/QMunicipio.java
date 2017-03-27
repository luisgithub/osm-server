package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMunicipio is a Querydsl query type for Municipio
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMunicipio extends EntityPathBase<Municipio> {

    private static final long serialVersionUID = -814642602L;

    public static final QMunicipio municipio = new QMunicipio("municipio");

    public final StringPath clave = createString("clave");

    public final StringPath clave_cabecera = createString("clave_cabecera");

    public final StringPath entidad = createString("entidad");

    public final DatePath<java.util.Date> fecha_modificacion = createDate("fecha_modificacion", java.util.Date.class);

    public final StringPath nombre = createString("nombre");

    public final StringPath nombre_cabecera = createString("nombre_cabecera");

    public QMunicipio(String variable) {
        super(Municipio.class, forVariable(variable));
    }

    public QMunicipio(Path<? extends Municipio> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMunicipio(PathMetadata metadata) {
        super(Municipio.class, metadata);
    }

}

