package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QColor is a Querydsl query type for Color
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QColor extends EntityPathBase<Color> {

    private static final long serialVersionUID = -1259291060L;

    public static final QColor color = new QColor("color");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<java.math.BigDecimal> precio_venta = createNumber("precio_venta", java.math.BigDecimal.class);

    public QColor(String variable) {
        super(Color.class, forVariable(variable));
    }

    public QColor(Path<? extends Color> path) {
        super(path.getType(), path.getMetadata());
    }

    public QColor(PathMetadata metadata) {
        super(Color.class, metadata);
    }

}

