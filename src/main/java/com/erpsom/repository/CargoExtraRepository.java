package com.erpsom.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.erpsom.domain.CargoExtra;

public interface CargoExtraRepository extends CrudRepository<CargoExtra, Long> {
	@Query(value = "SELECT ce FROM CargoExtra ce WHERE LOWER(ce.descripcion) LIKE LOWER(CONCAT('%', ?1 ,'%'))")
	Page<CargoExtra> firt15ByDescription(String description, Pageable pageable);
}
