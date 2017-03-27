package com.erpsom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erpsom.repository.CargoExtraRepository;

@RestController
@RequestMapping("/api/CargoExtra")
public class CargoExtraController {
	@Autowired
	CargoExtraRepository cargoExtraRepository;

	@RequestMapping(
			value = "/byDescription/{description}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Object> getByDescription(@PathVariable("description") String description){
		return new ResponseEntity<>(cargoExtraRepository.firt15ByDescription(description,new PageRequest(0, 15)),HttpStatus.OK);
	}
}
