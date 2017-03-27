package com.erpsom.web;

import com.erpsom.domain.Matriz;
import com.erpsom.repository.MatrizRepository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/26/17.
 */
@RestController
@RequestMapping("matriz")
public class MatrizController {

    @Autowired
    MatrizRepository matrizRepository;

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<?> createMatriz(@RequestBody Matriz matriz){
        Matriz newMatriz = matrizRepository.save(matriz);
        return new ResponseEntity<Object>(matriz, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updateMatriz(@RequestBody Matriz matriz){
        Matriz updMatriz = matrizRepository.save(matriz);
        return new ResponseEntity<Object>(matriz,HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{idMatriz}"
    )
    public ResponseEntity<?> getMatriz(@PathVariable("idMatriz") Long idMatriz){
        Matriz matriz = null;
        try {
            matriz = matrizRepository.findOne(idMatriz);
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return new ResponseEntity<Object>(matriz, HttpStatus.OK);
    }
}
