package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntidad is a Querydsl query type for Entidad
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntidad extends EntityPathBase<Entidad> {

    private static final long serialVersionUID = -1539321198L;

    public static final QEntidad entidad = new QEntidad("entidad");

    public final StringPath abreviacion = createString("abreviacion");

    public final StringPath clave = createString("clave");

    public final DatePath<java.util.Date> fecha_modificacion = createDate("fecha_modificacion", java.util.Date.class);

    public final StringPath nombre = createString("nombre");

    public final StringPath pais = createString("pais");

    public QEntidad(String variable) {
        super(Entidad.class, forVariable(variable));
    }

    public QEntidad(Path<? extends Entidad> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntidad(PathMetadata metadata) {
        super(Entidad.class, metadata);
    }

}

