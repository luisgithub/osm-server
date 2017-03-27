package com.erpsom.web;

import com.erpsom.domain.Rx;
import com.erpsom.repository.RxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 2/26/17.
 */

@RestController
@RequestMapping("/rx")
public class RxController {

    @Autowired
    RxRepository rxRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id}"
    )
    public ResponseEntity<?> getRx(@PathVariable("id") Long id){
        Rx rx = rxRepository.findOne(id);
        return new ResponseEntity<>(rx, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<?> createRx(@RequestBody Rx rx){
        Rx newRx = rxRepository.save(rx);
        return new ResponseEntity<>(rx, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.PUT
    )
    public ResponseEntity<?> updateRx(@RequestBody Rx rx){
        Rx updRx = rxRepository.save(rx);
        return new ResponseEntity<>(rx, HttpStatus.OK);
    }

}
