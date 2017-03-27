package com.erpsom.repository;

import com.erpsom.domain.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/1/16.
 */
public interface ProductoRepository extends CrudRepository<Producto, Long> {
    Producto findByCodigo(String codigo);
    @Query(value = "SELECT p FROM Producto p where LOWER(p.descripcion) LIKE LOWER(CONCAT('%', ?1 ,'%'))")
    Page<Producto> queryFirst15ByDescription(String description, Pageable pageable);

}
