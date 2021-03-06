package com.erpsom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erpsom.repository.TipoLenteRepository;

@RestController
@RequestMapping("/api/tipolente")
public class TipoLenteController {
	@Autowired
	TipoLenteRepository tipoLenteRepository;
	
	@RequestMapping(
			value = "/getAll",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Object> getTiposLente(){
		return new ResponseEntity<>(tipoLenteRepository.findAll(),HttpStatus.OK);
	}
}
