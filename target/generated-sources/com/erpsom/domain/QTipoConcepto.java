package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTipoConcepto is a Querydsl query type for TipoConcepto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTipoConcepto extends EntityPathBase<TipoConcepto> {

    private static final long serialVersionUID = 1218486098L;

    public static final QTipoConcepto tipoConcepto = new QTipoConcepto("tipoConcepto");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QTipoConcepto(String variable) {
        super(TipoConcepto.class, forVariable(variable));
    }

    public QTipoConcepto(Path<? extends TipoConcepto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoConcepto(PathMetadata metadata) {
        super(TipoConcepto.class, metadata);
    }

}

