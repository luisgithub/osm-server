package com.erpsom.repository;

import com.erpsom.domain.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/21/17.
 */
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
}
