package com.erpsom.web;

import com.erpsom.domain.Historia;
import com.erpsom.repository.HistoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/7/17.
 */
@RestController
@RequestMapping("historia")
public class HistoriaController {

    @Autowired
    HistoriaRepository historiaRepository;

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<?> createHistoria(@RequestBody Historia historia){
        Historia newHistoria = historiaRepository.save(historia);
        return new ResponseEntity<>(historia, HttpStatus.CREATED);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/{idHistoria}"
    )
    public ResponseEntity<?> updateHistoria(@RequestBody Historia historia){
        Historia updHistoria = historiaRepository.save(historia);
        return new ResponseEntity<>(updHistoria, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{idHistoria}"
    )
    public ResponseEntity<?> getHistoria(@PathVariable("idHistoria") Long idHistoria){
        Historia historia = historiaRepository.findOne(idHistoria);
        return new ResponseEntity<>(historia,HttpStatus.OK);
    }
}
