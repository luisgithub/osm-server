package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPresupuesto is a Querydsl query type for Presupuesto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPresupuesto extends EntityPathBase<Presupuesto> {

    private static final long serialVersionUID = 936690652L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPresupuesto presupuesto = new QPresupuesto("presupuesto");

    public final NumberPath<Integer> asistente = createNumber("asistente", Integer.class);

    public final NumberPath<Integer> doctor = createNumber("doctor", Integer.class);

    public final DatePath<java.util.Date> fecha = createDate("fecha", java.util.Date.class);

    public final DatePath<java.util.Date> fecha_entrega = createDate("fecha_entrega", java.util.Date.class);

    public final StringPath garantia_ultra = createString("garantia_ultra");

    public final NumberPath<Long> Id = createNumber("Id", Long.class);

    public final NumberPath<java.math.BigDecimal> iva = createNumber("iva", java.math.BigDecimal.class);

    public final QPaciente paciente;

    public final SetPath<PresupuestoDetalle, QPresupuestoDetalle> presupuestoDetalleSet = this.<PresupuestoDetalle, QPresupuestoDetalle>createSet("presupuestoDetalleSet", PresupuestoDetalle.class, QPresupuestoDetalle.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> subtotal = createNumber("subtotal", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    public QPresupuesto(String variable) {
        this(Presupuesto.class, forVariable(variable), INITS);
    }

    public QPresupuesto(Path<? extends Presupuesto> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPresupuesto(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPresupuesto(PathMetadata metadata, PathInits inits) {
        this(Presupuesto.class, metadata, inits);
    }

    public QPresupuesto(Class<? extends Presupuesto> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.paciente = inits.isInitialized("paciente") ? new QPaciente(forProperty("paciente")) : null;
    }

}

