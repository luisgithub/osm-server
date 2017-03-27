package com.erpsom.web;

import com.erpsom.domain.Lente;
import com.erpsom.repository.LenteRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/lente")
public class LenteController {
	
	@Autowired
	LenteRepository lenteRepository;
	static final Logger logger = LogManager.getLogger(LenteController.class);
	
	@RequestMapping(
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Lente> createLente(@RequestBody Lente newLente){
		Lente lente = lenteRepository.save(newLente);
		return new ResponseEntity<>(lente,HttpStatus.CREATED);
	}

	@RequestMapping(
			value = "/{idLente}"
	)
	public ResponseEntity<?> deleteLente(@PathVariable("idLente") Long idLente){
		lenteRepository.delete(idLente);
		HashMap<String, Object> result = new HashMap<String,Object>();
		result.put("item",idLente);
		result.put("msg", "item deleted");
		result.put("success", true);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/getLentes",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Object> getLentes(){
		return new ResponseEntity<>(lenteRepository.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(
			value ="/getLentesTipo/{tipo_lente}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Object> getLentesTipo(@PathVariable("tipo_lente") int tipo_lente){
		return new ResponseEntity<>(lenteRepository.findByTipoLente(tipo_lente),HttpStatus.OK);
	}
	
}
