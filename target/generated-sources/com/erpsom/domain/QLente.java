package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLente is a Querydsl query type for Lente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLente extends EntityPathBase<Lente> {

    private static final long serialVersionUID = -1251275217L;

    public static final QLente lente = new QLente("lente");

    public final StringPath acabado = createString("acabado");

    public final BooleanPath activo = createBoolean("activo");

    public final StringPath adicion = createString("adicion");

    public final StringPath base = createString("base");

    public final StringPath cilindro = createString("cilindro");

    public final StringPath codigo = createString("codigo");

    public final StringPath descripcion = createString("descripcion");

    public final StringPath esfera = createString("esfera");

    public final DatePath<java.util.Date> fecha_registro = createDate("fecha_registro", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath material = createString("material");

    public final StringPath medida = createString("medida");

    public final NumberPath<Integer> tipo_lente = createNumber("tipo_lente", Integer.class);

    public QLente(String variable) {
        super(Lente.class, forVariable(variable));
    }

    public QLente(Path<? extends Lente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLente(PathMetadata metadata) {
        super(Lente.class, metadata);
    }

}

