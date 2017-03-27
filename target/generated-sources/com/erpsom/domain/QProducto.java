package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProducto is a Querydsl query type for Producto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProducto extends EntityPathBase<Producto> {

    private static final long serialVersionUID = 624520663L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProducto producto = new QProducto("producto");

    public final QArmazon armazon;

    public final NumberPath<Integer> categoria = createNumber("categoria", Integer.class);

    public final StringPath codigo = createString("codigo");

    public final DatePath<java.util.Date> creado = createDate("creado", java.util.Date.class);

    public final StringPath descripcion = createString("descripcion");

    public final BooleanPath esServicio = createBoolean("esServicio");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLente lente;

    public final StringPath nombre = createString("nombre");

    public final NumberPath<java.math.BigDecimal> precioCompra = createNumber("precioCompra", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> precioVenta = createNumber("precioVenta", java.math.BigDecimal.class);

    public final NumberPath<Integer> proveedor = createNumber("proveedor", Integer.class);

    public QProducto(String variable) {
        this(Producto.class, forVariable(variable), INITS);
    }

    public QProducto(Path<? extends Producto> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProducto(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProducto(PathMetadata metadata, PathInits inits) {
        this(Producto.class, metadata, inits);
    }

    public QProducto(Class<? extends Producto> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.armazon = inits.isInitialized("armazon") ? new QArmazon(forProperty("armazon")) : null;
        this.lente = inits.isInitialized("lente") ? new QLente(forProperty("lente")) : null;
    }

}

