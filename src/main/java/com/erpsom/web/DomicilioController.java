package com.erpsom.web;

import com.erpsom.domain.Domicilio;
import com.erpsom.repository.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**,
 *
 * Created by HMO SmartClinic Ninja Development Team on 2/25/17.
 */

@RestController
@RequestMapping("/api/domicilio")
public class DomicilioController {

    @Autowired
    DomicilioRepository domicilioRepository;

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Domicilio> crearCliente(@RequestBody Domicilio domicilio){
        return new ResponseEntity<Domicilio>(domicilioRepository.save(domicilio), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{idDomicilio}",
            method = RequestMethod.GET
    )
    public ResponseEntity<?> getDomicilio(@PathVariable("idDomicilio") Long idDomicilio){
        Domicilio domicilio = domicilioRepository.findOne(idDomicilio);
        return new ResponseEntity<>(domicilio, HttpStatus.OK);
    }
}
