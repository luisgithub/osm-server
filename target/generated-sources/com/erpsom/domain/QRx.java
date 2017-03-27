package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRx is a Querydsl query type for Rx
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRx extends EntityPathBase<Rx> {

    private static final long serialVersionUID = -1329721347L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRx rx = new QRx("rx");

    public final StringPath AddOd = createString("AddOd");

    public final StringPath AddOi = createString("AddOi");

    public final StringPath AlturaOd = createString("AlturaOd");

    public final StringPath AlturaOi = createString("AlturaOi");

    public final StringPath CilOd = createString("CilOd");

    public final StringPath CilOi = createString("CilOi");

    public final NumberPath<Integer> Color = createNumber("Color", Integer.class);

    public final StringPath DCod = createString("DCod");

    public final StringPath DCoi = createString("DCoi");

    public final StringPath DLod = createString("DLod");

    public final StringPath DLoi = createString("DLoi");

    public final StringPath EjeOd = createString("EjeOd");

    public final StringPath EjeOi = createString("EjeOi");

    public final StringPath EsfOd = createString("EsfOd");

    public final StringPath EsfOi = createString("EsfOi");

    public final NumberPath<Long> Id = createNumber("Id", Long.class);

    public final NumberPath<Integer> Lente = createNumber("Lente", Integer.class);

    public final QPaciente paciente;

    public final StringPath prisma = createString("prisma");

    public final NumberPath<Integer> TipoLente = createNumber("TipoLente", Integer.class);

    public QRx(String variable) {
        this(Rx.class, forVariable(variable), INITS);
    }

    public QRx(Path<? extends Rx> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRx(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRx(PathMetadata metadata, PathInits inits) {
        this(Rx.class, metadata, inits);
    }

    public QRx(Class<? extends Rx> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.paciente = inits.isInitialized("paciente") ? new QPaciente(forProperty("paciente")) : null;
    }

}

