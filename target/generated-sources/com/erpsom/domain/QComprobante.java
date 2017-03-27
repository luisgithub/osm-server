package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QComprobante is a Querydsl query type for Comprobante
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QComprobante extends EntityPathBase<Comprobante> {

    private static final long serialVersionUID = -1805246243L;

    public static final QComprobante comprobante = new QComprobante("comprobante");

    public final SimplePath<com.erpsom.domain.json.ComprobanteInfo> comprobanteInfo = createSimple("comprobanteInfo", com.erpsom.domain.json.ComprobanteInfo.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QComprobante(String variable) {
        super(Comprobante.class, forVariable(variable));
    }

    public QComprobante(Path<? extends Comprobante> path) {
        super(path.getType(), path.getMetadata());
    }

    public QComprobante(PathMetadata metadata) {
        super(Comprobante.class, metadata);
    }

}

