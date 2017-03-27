package com.erpsom.repository;

import com.erpsom.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/12/17.
 */
@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {

}
