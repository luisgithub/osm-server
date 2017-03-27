package com.erpsom.repository;

import com.erpsom.domain.Entidad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by HMO SmartClinic Ninja Development Team on 2/25/17.
 */
public interface EntidadRepository extends CrudRepository<Entidad, String> {
    List<Entidad> findByPais(String pais);
}
