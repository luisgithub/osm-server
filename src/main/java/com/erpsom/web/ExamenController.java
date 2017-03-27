package com.erpsom.web;

import com.erpsom.domain.Examen;
import com.erpsom.repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/9/17.
 */
@RestController
@RequestMapping("/examen")
public class ExamenController {

    @Autowired
    ExamenRepository examenRepository;

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<?> createExamen(@RequestBody Examen examen){
        Examen newExamen = examenRepository.save(examen);
        return new ResponseEntity<>(examen, HttpStatus.CREATED);
    }

    @RequestMapping(
            method = RequestMethod.PUT
    )
    public ResponseEntity<?> updateExamen(@RequestBody Examen examen){
        Examen updExamen = examenRepository.save(examen);
        return new ResponseEntity<>(updExamen, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{idExamen}"
    )
    public ResponseEntity<?> getExamen(@PathVariable("idExamen") Long idExamen){
        Examen examen = examenRepository.findOne(idExamen);
        return new ResponseEntity<>(examen, HttpStatus.OK);
    }
}
