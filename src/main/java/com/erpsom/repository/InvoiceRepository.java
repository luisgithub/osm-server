package com.erpsom.repository;

import com.erpsom.domain.Invoice;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/11/17.
 */
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}
