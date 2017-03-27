package com.erpsom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.erpsom.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    List<Cliente> findByNombres(String nombres);

    List<Cliente> findByApellidoPaterno(String apellidoPaterno);
    
    @Query(value = "SELECT c FROM Cliente c WHERE UPPER(c.nombres) LIKE UPPER(CONCAT('%', ?1 ,'%')) OR UPPER(c.apellidoPaterno) LIKE UPPER(CONCAT('%', ?1 , '%'))")
    List<Cliente> findByValue(String value);
}
