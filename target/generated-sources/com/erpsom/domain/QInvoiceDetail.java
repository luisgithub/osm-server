package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInvoiceDetail is a Querydsl query type for InvoiceDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInvoiceDetail extends EntityPathBase<InvoiceDetail> {

    private static final long serialVersionUID = 1111754695L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInvoiceDetail invoiceDetail = new QInvoiceDetail("invoiceDetail");

    public final NumberPath<Integer> cantidad = createNumber("cantidad", Integer.class);

    public final StringPath codigo = createString("codigo");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QInvoice invoice;

    public QInvoiceDetail(String variable) {
        this(InvoiceDetail.class, forVariable(variable), INITS);
    }

    public QInvoiceDetail(Path<? extends InvoiceDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInvoiceDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInvoiceDetail(PathMetadata metadata, PathInits inits) {
        this(InvoiceDetail.class, metadata, inits);
    }

    public QInvoiceDetail(Class<? extends InvoiceDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.invoice = inits.isInitialized("invoice") ? new QInvoice(forProperty("invoice")) : null;
    }

}

