package com.erpsom.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPaciente is a Querydsl query type for Paciente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPaciente extends EntityPathBase<Paciente> {

    private static final long serialVersionUID = -1917538328L;

    public static final QPaciente paciente = new QPaciente("paciente");

    public final BooleanPath active = createBoolean("active");

    public final StringPath apellidoMaterno = createString("apellidoMaterno");

    public final StringPath apellidoPaterno = createString("apellidoPaterno");

    public final StringPath celular = createString("celular");

    public final StringPath email = createString("email");

    public final StringPath homoclave = createString("homoclave");

    public final NumberPath<Long> Id = createNumber("Id", Long.class);

    public final DatePath<java.util.Date> nacimiento = createDate("nacimiento", java.util.Date.class);

    public final StringPath nombreCompleto = createString("nombreCompleto");

    public final StringPath nombres = createString("nombres");

    public final StringPath sexo = createString("sexo");

    public final StringPath telefono = createString("telefono");

    public QPaciente(String variable) {
        super(Paciente.class, forVariable(variable));
    }

    public QPaciente(Path<? extends Paciente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPaciente(PathMetadata metadata) {
        super(Paciente.class, metadata);
    }

}

