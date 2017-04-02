package com.erpsom.web;

import com.erpsom.domain.Venta;
import com.erpsom.domain.enums.EntityStatus;
import com.erpsom.repository.LenteRepository;
import com.erpsom.repository.VentaDetalleRepository;
import com.erpsom.repository.VentaRepository;
import com.erpsom.service.VentaService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("venta")
public class VentaController {
	static final Logger logger = LogManager.getLogger(VentaController.class);

	@Autowired
	VentaService ventaService;

	@Autowired
	LenteRepository lenteRepository;

	@Autowired
	VentaRepository ventaRepository;

	@Autowired
	VentaDetalleRepository ventaDetalleRepository;
	
	@RequestMapping(
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Object> createVenta(@RequestBody Venta venta, @RequestParam("comprobanteRequerido") boolean comprobanteRequerido){
		Venta newVenta = ventaService.saveVenta(venta);
		if(comprobanteRequerido){
			ventaService.crearCFD(newVenta);
		}
		return new ResponseEntity<>(newVenta,HttpStatus.CREATED);
	}

	@RequestMapping(
			method = RequestMethod.GET,
			value = "/{idVenta}"
	)
	public ResponseEntity<?> getVenta(@PathVariable("idVenta") Long idVenta){
		Venta venta = ventaRepository.findOne(idVenta);
		return new ResponseEntity<>(venta, HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/findLente/{value}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Object> findLente(@PathVariable("value") String value){
		return new ResponseEntity<>(lenteRepository.findFirst20ByName(value, new PageRequest(0, 15)),HttpStatus.OK);
	}

	@RequestMapping(
			method = RequestMethod.PUT,
			value = "{idVenta}/cancelar"
	)
	public ResponseEntity<?> cancelaVenta(@PathVariable("idVenta") Long idVenta){
		Venta venta = ventaRepository.findOne(idVenta);
		venta.setEstado(EntityStatus.cancelado.toString());
		venta = ventaRepository.save(venta);
		return new ResponseEntity<>(venta, HttpStatus.OK);
	}
	
}
