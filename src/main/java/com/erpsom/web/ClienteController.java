package com.erpsom.web;

import com.erpsom.domain.Cliente;
import com.erpsom.repository.ClienteRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
    static final Logger logger = LogManager.getLogger(ClienteController.class.getName());

	
    @RequestMapping(
    		value = "/findByName/{name}",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE
    		)
    public ResponseEntity<Object> getByName(@PathVariable("name") String name){
    	logger.info("Querying by name");
    	return new ResponseEntity<>(clienteRepository.findByNombres(name), HttpStatus.OK);
    }
    
	@RequestMapping(
			value = "/list",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getCustomers(){
		logger.info("Quering all customers");
		return new ResponseEntity<>(clienteRepository.findAll(), HttpStatus.OK);
	}

	@RequestMapping(
			value = "/byFirstname/{firstname}",
			method = RequestMethod.GET
	)
	public ArrayList<Cliente> getCustomer(@PathVariable("firstname") String firstname){
		ArrayList<Cliente> customers = null;
		try{
			customers = (ArrayList<Cliente>) clienteRepository.findByValue(firstname);
		} catch(Exception e){
			logger.error("Error on getting customers: "+e.getMessage());
		}
		return customers;
	}	
	
	@RequestMapping(
			value = "/{id}",
			method = RequestMethod.GET
	)
	public ResponseEntity<Cliente> byId(@PathVariable("id") Long id){
		logger.info("Quering the customer id "+id);
		Cliente cliente = clienteRepository.findOne(id);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	
	@RequestMapping(
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente newCliente){
		newCliente.getDomicilios().forEach(domicilio -> domicilio.setCliente(newCliente));
		logger.info("creating cliente "+ newCliente.getNombres());
		Cliente savedCustomer = clienteRepository.save(newCliente);
        return new ResponseEntity<Cliente>( savedCustomer, HttpStatus.OK);		
	}
	
	@RequestMapping(
			value = "/update",
			method = RequestMethod.PUT
	)
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente oldCliente){
		logger.info("updating cliente "+ oldCliente.getNombres());
		Cliente savedCustomer = clienteRepository.save(oldCliente);
		return new ResponseEntity<Cliente>(savedCustomer, HttpStatus.OK);
	}
}
