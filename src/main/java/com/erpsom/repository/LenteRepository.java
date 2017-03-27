package com.erpsom.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.erpsom.domain.Lente;

public interface LenteRepository extends CrudRepository<Lente, Long>{
	@Query(value = "SELECT len FROM Lente len WHERE len.tipo_lente = ?1")
	List<Lente> findByTipoLente(int tipo_lente);
	
	@Query(value ="SELECT len FROM Lente len WHERE UPPER(len.descripcion) LIKE UPPER(CONCAT('%', ?1 ,'%'))")
	Page<Lente> findFirst20ByName(String value, Pageable pageable);
}
