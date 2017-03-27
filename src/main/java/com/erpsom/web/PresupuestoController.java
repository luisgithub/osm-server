package com.erpsom.web;

import com.erpsom.domain.Presupuesto;
import com.erpsom.domain.PresupuestoDetalle;
import com.erpsom.repository.PresupuestoDetalleRepository;
import com.erpsom.repository.PresupuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/9/17.
 */

@Transactional
@RestController
@RequestMapping("presupuesto")
public class PresupuestoController {

    @Autowired
    PresupuestoRepository presupuestoRepository;

    @Autowired
    PresupuestoDetalleRepository presupuestoDetalleRepository;

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<?> createPresupuesto(@RequestBody Presupuesto presupuesto){
        Presupuesto newPresupuesto = presupuestoRepository.save(presupuesto);
        for(PresupuestoDetalle presupuestoDetalle : presupuesto.getPresupuestoDetalleSet()){
            presupuestoDetalle.setPresupuesto(presupuesto);
            presupuestoDetalle = presupuestoDetalleRepository.save(presupuestoDetalle);
        }
        return new ResponseEntity<>(newPresupuesto, HttpStatus.CREATED);
    }

    @RequestMapping(
            method = RequestMethod.PUT
    )
    public ResponseEntity<?> updatePresupuesto(@RequestBody Presupuesto presupuesto){
        Presupuesto updPresupuesto = presupuestoRepository.save(presupuesto);
        return new ResponseEntity<>(updPresupuesto, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{idPresupuesto}"
    )
    public ResponseEntity<?> getPresupuesto(@PathVariable("idPresupuesto") Long idPresupuesto){
        Presupuesto presupuesto = presupuestoRepository.findOne(idPresupuesto);
        return new ResponseEntity<>(presupuesto,HttpStatus.OK);
    }
}
