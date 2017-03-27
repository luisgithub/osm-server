package com.erpsom.web;

import com.erpsom.domain.Entidad;
import com.erpsom.domain.Municipio;
import com.erpsom.repository.EntidadRepository;
import com.erpsom.repository.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by HMO SmartClinic Ninja Development Team on 2/25/17.
 */

@RestController
@RequestMapping("/api/ubicacion")
public class UbicacionController {

    @Autowired
    MunicipioRepository municipioRepository;

    @Autowired
    EntidadRepository entidadRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{entidad}/municipio"
    )
    public ResponseEntity<?> getMunicipios(@PathVariable("entidad") String entidad){
        List<Municipio> municipioList =  municipioRepository.findByEntidad(entidad);
        return new ResponseEntity<>(municipioList, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{pais}/entidad"
    )
    public ResponseEntity<?> getEntidades(@PathVariable("pais") String pais){
        List<Entidad> entidadList = entidadRepository.findByPais(pais);
        return new ResponseEntity<>(entidadList,HttpStatus.OK);
    }
}
