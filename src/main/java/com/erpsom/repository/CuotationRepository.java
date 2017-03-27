package com.erpsom.repository;

import org.springframework.data.repository.CrudRepository;

import com.erpsom.domain.Presupuesto;

public interface CuotationRepository extends CrudRepository<Presupuesto, Long> {

}
