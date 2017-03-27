package com.erpsom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erpsom.repository.TipoConceptoRepository;

@RestController
@RequestMapping("/api/TipoConcepto")
public class TipoConceptoController {
	
	@Autowired
	TipoConceptoRepository tipoConceptoRepository;
	
	@RequestMapping(
			value = "getAll",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Object> getAll(){
		return new ResponseEntity<>(tipoConceptoRepository.findAll(),HttpStatus.OK);
	}

}
