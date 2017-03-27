package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCargoExtra is a Querydsl query type for CargoExtra
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCargoExtra extends EntityPathBase<CargoExtra> {

    private static final long serialVersionUID = 1187220587L;

    public static final QCargoExtra cargoExtra = new QCargoExtra("cargoExtra");

    public final BooleanPath activo = createBoolean("activo");

    public final StringPath codigo = createString("codigo");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> precio_costo = createNumber("precio_costo", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> precio_venta = createNumber("precio_venta", java.math.BigDecimal.class);

    public QCargoExtra(String variable) {
        super(CargoExtra.class, forVariable(variable));
    }

    public QCargoExtra(Path<? extends CargoExtra> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCargoExtra(PathMetadata metadata) {
        super(CargoExtra.class, metadata);
    }

}

