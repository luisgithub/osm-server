package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCliente is a Querydsl query type for Cliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCliente extends EntityPathBase<Cliente> {

    private static final long serialVersionUID = 913112739L;

    public static final QCliente cliente = new QCliente("cliente");

    public final StringPath apellidoMaterno = createString("apellidoMaterno");

    public final StringPath apellidoPaterno = createString("apellidoPaterno");

    public final StringPath celular = createString("celular");

    public final DatePath<java.util.Date> creado = createDate("creado", java.util.Date.class);

    public final CollectionPath<Domicilio, QDomicilio> domicilios = this.<Domicilio, QDomicilio>createCollection("domicilios", Domicilio.class, QDomicilio.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nombreCompleto = createString("nombreCompleto");

    public final StringPath nombres = createString("nombres");

    public final StringPath rfc = createString("rfc");

    public final StringPath telefono = createString("telefono");

    public QCliente(String variable) {
        super(Cliente.class, forVariable(variable));
    }

    public QCliente(Path<? extends Cliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCliente(PathMetadata metadata) {
        super(Cliente.class, metadata);
    }

}

