package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVentaDetalle is a Querydsl query type for VentaDetalle
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVentaDetalle extends EntityPathBase<VentaDetalle> {

    private static final long serialVersionUID = 1014875778L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVentaDetalle ventaDetalle = new QVentaDetalle("ventaDetalle");

    public final NumberPath<java.math.BigDecimal> cantidad = createNumber("cantidad", java.math.BigDecimal.class);

    public final StringPath codigo = createString("codigo");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<java.math.BigDecimal> descuento = createNumber("descuento", java.math.BigDecimal.class);

    public final NumberPath<Long> Id = createNumber("Id", Long.class);

    public final NumberPath<java.math.BigDecimal> importe = createNumber("importe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> precioUnitario = createNumber("precioUnitario", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    public final StringPath unidad = createString("unidad");

    public final QVenta venta;

    public QVentaDetalle(String variable) {
        this(VentaDetalle.class, forVariable(variable), INITS);
    }

    public QVentaDetalle(Path<? extends VentaDetalle> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVentaDetalle(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVentaDetalle(PathMetadata metadata, PathInits inits) {
        this(VentaDetalle.class, metadata, inits);
    }

    public QVentaDetalle(Class<? extends VentaDetalle> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.venta = inits.isInitialized("venta") ? new QVenta(forProperty("venta"), inits.get("venta")) : null;
    }

}

