package com.erpsom.repository;

import com.erpsom.domain.Paciente;
import com.querydsl.core.types.Predicate;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PacienteRepository extends CrudRepository<Paciente, Long>, QueryDslPredicateExecutor<Paciente> {
    List<Paciente> findAll(Predicate predicate);
}
