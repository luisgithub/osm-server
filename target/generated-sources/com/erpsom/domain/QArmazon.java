package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QArmazon is a Querydsl query type for Armazon
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArmazon extends EntityPathBase<Armazon> {

    private static final long serialVersionUID = -686533411L;

    public static final QArmazon armazon = new QArmazon("armazon");

    public final BooleanPath activo = createBoolean("activo");

    public final NumberPath<Integer> categoria = createNumber("categoria", Integer.class);

    public final NumberPath<Integer> color = createNumber("color", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> marca = createNumber("marca", Integer.class);

    public final StringPath medida = createString("medida");

    public final NumberPath<Integer> modelo = createNumber("modelo", Integer.class);

    public QArmazon(String variable) {
        super(Armazon.class, forVariable(variable));
    }

    public QArmazon(Path<? extends Armazon> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArmazon(PathMetadata metadata) {
        super(Armazon.class, metadata);
    }

}

