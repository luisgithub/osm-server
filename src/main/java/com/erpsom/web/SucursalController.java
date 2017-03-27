package com.erpsom.web;

import com.erpsom.domain.Sucursal;
import com.erpsom.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/26/17.
 */
@RestController
@RequestMapping("sucursal")
public class SucursalController {

    @Autowired
    SucursalRepository sucursalRepository;

    @PostMapping
    public ResponseEntity<?> createSucursal(@RequestBody Sucursal sucursal){
        Sucursal newSucursal = sucursalRepository.save(sucursal);
        return new ResponseEntity<>(newSucursal, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updateSucursal(@RequestBody Sucursal sucursal){
        Sucursal newSucursal = sucursalRepository.save(sucursal);
        return new ResponseEntity<>(newSucursal, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{idSucursal}"
    )
    public ResponseEntity<Sucursal> getSucursal(@PathVariable("idSucursal") Long idSucursal){
        Sucursal sucursal = null;
//        try {
            sucursal = sucursalRepository.findOne(idSucursal);
//        } catch (HibernateException ex) {
//            throw new HibernateException(ex);
//        }
        return new ResponseEntity<Sucursal>(sucursal, HttpStatus.OK);
    }


}