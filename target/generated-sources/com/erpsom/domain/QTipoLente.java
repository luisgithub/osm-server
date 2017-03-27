package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTipoLente is a Querydsl query type for TipoLente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTipoLente extends EntityPathBase<TipoLente> {

    private static final long serialVersionUID = 1904611035L;

    public static final QTipoLente tipoLente = new QTipoLente("tipoLente");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath tipo_lente = createString("tipo_lente");

    public QTipoLente(String variable) {
        super(TipoLente.class, forVariable(variable));
    }

    public QTipoLente(Path<? extends TipoLente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoLente(PathMetadata metadata) {
        super(TipoLente.class, metadata);
    }

}

