package com.erpsom.web;

import com.erpsom.domain.Paciente;
import com.erpsom.repository.PacienteRepository;
import com.erpsom.service.PacienteService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("paciente")
public class PacienteController {

		@Autowired 
		PacienteRepository patientRepository;

		@Autowired
		PacienteService pacienteService;

		static final Logger logger = LogManager.getLogger(PacienteController.class);
		
		@RequestMapping(
				method = RequestMethod.POST
		)
		public ResponseEntity<Paciente> createPatient(@RequestBody Paciente newPatient){
			logger.info("creating new Patient "+ newPatient.getNombreCompleto()+" "+newPatient.getNacimiento() );
			Paciente savedPatient = patientRepository.save(newPatient);
			return new ResponseEntity<>(savedPatient,HttpStatus.CREATED);
		}
		
		@RequestMapping(
				method=RequestMethod.PUT
		)
		public ResponseEntity<Paciente>updatePatient(@RequestBody Paciente paciente){
			Paciente savedPatient = patientRepository.save(paciente);
			logger.info("updating Patient "+ paciente.getNombreCompleto()+" "+paciente.getNacimiento() );
			return new ResponseEntity<>(savedPatient,HttpStatus.OK);
		}
		
		@RequestMapping(
				method = RequestMethod.GET
		)
		public ResponseEntity<?> findByName(@RequestParam("searchValue") String searchValue ){
			List<Paciente> pacienteList = pacienteService.getPacienteByValue(searchValue);
			return new ResponseEntity<>(pacienteList, HttpStatus.OK);
			
		}

		@RequestMapping(
				method = RequestMethod.GET,
				value = "{idPaciente}"
		)
		public ResponseEntity<?> getPaciente(@PathVariable("idPaciente") Long idPaciente){
			Paciente paciente = patientRepository.findOne(idPaciente);
			return new ResponseEntity<>(paciente, HttpStatus.OK);
		}

		@RequestMapping(
				method = RequestMethod.GET,
				value = "/cumplenHoy"
		)
		public ResponseEntity<List<Paciente>> getPacientesCumplenHoy(){
			List<Paciente> pacienteList = pacienteService.getPacientesCumplenHoy();
			return new ResponseEntity<>(pacienteList, HttpStatus.OK);
		}
}
