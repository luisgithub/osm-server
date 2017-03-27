package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPresupuestoDetalle is a Querydsl query type for PresupuestoDetalle
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPresupuestoDetalle extends EntityPathBase<PresupuestoDetalle> {

    private static final long serialVersionUID = -1670512133L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPresupuestoDetalle presupuestoDetalle = new QPresupuestoDetalle("presupuestoDetalle");

    public final NumberPath<java.math.BigDecimal> cantidad = createNumber("cantidad", java.math.BigDecimal.class);

    public final StringPath codigo = createString("codigo");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<java.math.BigDecimal> descuento = createNumber("descuento", java.math.BigDecimal.class);

    public final NumberPath<Long> Id = createNumber("Id", Long.class);

    public final NumberPath<java.math.BigDecimal> importe = createNumber("importe", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> precioUnitario = createNumber("precioUnitario", java.math.BigDecimal.class);

    public final QPresupuesto presupuesto;

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    public QPresupuestoDetalle(String variable) {
        this(PresupuestoDetalle.class, forVariable(variable), INITS);
    }

    public QPresupuestoDetalle(Path<? extends PresupuestoDetalle> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPresupuestoDetalle(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPresupuestoDetalle(PathMetadata metadata, PathInits inits) {
        this(PresupuestoDetalle.class, metadata, inits);
    }

    public QPresupuestoDetalle(Class<? extends PresupuestoDetalle> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.presupuesto = inits.isInitialized("presupuesto") ? new QPresupuesto(forProperty("presupuesto"), inits.get("presupuesto")) : null;
    }

}

