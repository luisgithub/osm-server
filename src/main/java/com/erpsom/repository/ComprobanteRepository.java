package com.erpsom.repository;


import com.erpsom.domain.Comprobante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/16/17.
 */
@Repository
public interface ComprobanteRepository extends CrudRepository<Comprobante, Long> {
}
