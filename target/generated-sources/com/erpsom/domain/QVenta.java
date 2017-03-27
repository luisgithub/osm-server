package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVenta is a Querydsl query type for Venta
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVenta extends EntityPathBase<Venta> {

    private static final long serialVersionUID = -1242040011L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVenta venta = new QVenta("venta");

    public final QCliente cliente;

    public final NumberPath<java.math.BigDecimal> descuento = createNumber("descuento", java.math.BigDecimal.class);

    public final StringPath estado = createString("estado");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final StringPath folio = createString("folio");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> iva = createNumber("iva", java.math.BigDecimal.class);

    public final StringPath metodoPago = createString("metodoPago");

    public final NumberPath<java.math.BigDecimal> subtotal = createNumber("subtotal", java.math.BigDecimal.class);

    public final QSucursal sucursal;

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    public final SetPath<VentaDetalle, QVentaDetalle> ventaDetalleSet = this.<VentaDetalle, QVentaDetalle>createSet("ventaDetalleSet", VentaDetalle.class, QVentaDetalle.class, PathInits.DIRECT2);

    public QVenta(String variable) {
        this(Venta.class, forVariable(variable), INITS);
    }

    public QVenta(Path<? extends Venta> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVenta(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVenta(PathMetadata metadata, PathInits inits) {
        this(Venta.class, metadata, inits);
    }

    public QVenta(Class<? extends Venta> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QCliente(forProperty("cliente")) : null;
        this.sucursal = inits.isInitialized("sucursal") ? new QSucursal(forProperty("sucursal"), inits.get("sucursal")) : null;
    }

}

