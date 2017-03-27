package com.erpsom.web;

import com.erpsom.domain.Armazon;
import com.erpsom.repository.ArmazonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/armazones")
public class ArmazonController {

    @Autowired
    ArmazonRepository armazonRepository;

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<Armazon> crateArmazon(@RequestBody Armazon armazon){
        Armazon newArmazon = armazonRepository.save(armazon);
        return new ResponseEntity<>(newArmazon,HttpStatus.CREATED);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{armazonId}"
    )
    public ResponseEntity<?> getArmazon(@PathVariable("armazonId") Long armazonId){
        Armazon armazon = armazonRepository.findOne(armazonId);
        return new ResponseEntity<>(armazon, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/{aramzonId}"
    )public ResponseEntity<?> updateArmazon(@RequestBody Armazon armazon){
        Armazon updArmazon = armazonRepository.save(armazon);
        return new ResponseEntity<>(updArmazon, HttpStatus.OK);
    }


}
