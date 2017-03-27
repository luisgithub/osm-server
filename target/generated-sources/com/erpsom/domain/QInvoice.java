package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInvoice is a Querydsl query type for Invoice
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInvoice extends EntityPathBase<Invoice> {

    private static final long serialVersionUID = 2012724182L;

    public static final QInvoice invoice = new QInvoice("invoice");

    public final DatePath<java.util.Date> fecha = createDate("fecha", java.util.Date.class);

    public final StringPath folio = createString("folio");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<InvoiceDetail, QInvoiceDetail> invoiceDetailSet = this.<InvoiceDetail, QInvoiceDetail>createSet("invoiceDetailSet", InvoiceDetail.class, QInvoiceDetail.class, PathInits.DIRECT2);

    public QInvoice(String variable) {
        super(Invoice.class, forVariable(variable));
    }

    public QInvoice(Path<? extends Invoice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInvoice(PathMetadata metadata) {
        super(Invoice.class, metadata);
    }

}

