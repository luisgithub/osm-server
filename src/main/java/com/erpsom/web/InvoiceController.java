package com.erpsom.web;

import com.erpsom.domain.Invoice;
import com.erpsom.domain.InvoiceDetail;
import com.erpsom.repository.InvoiceDetailRepository;
import com.erpsom.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/11/17.
 */

@RestController
@RequestMapping("invoice")
public class InvoiceController {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    InvoiceDetailRepository invoiceDetailRepository;

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<?> createInvoice(@RequestBody Invoice invoice){
        Invoice newInvoice = invoiceRepository.save(invoice);
//        invoice.getInvoiceDetailSet().forEach(
//               invoiceDetail -> invoiceDetail.setInvoice(invoice)
//        );

        for(InvoiceDetail invoiceDetail : newInvoice.getInvoiceDetailSet()){
            invoiceDetail.setInvoice(newInvoice);
            invoiceDetail = invoiceDetailRepository.save(invoiceDetail);
        }

        return new ResponseEntity<>(newInvoice, HttpStatus.CREATED);
    }

}
