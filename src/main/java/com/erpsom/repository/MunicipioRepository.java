package com.erpsom.repository;

import com.erpsom.domain.Municipio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by HMO SmartClinic Ninja Development Team on 2/25/17.
 */
public interface MunicipioRepository extends CrudRepository<Municipio, String> {
    List<Municipio> findByEntidad(String entidad);
}
