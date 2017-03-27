package com.erpsom.web;

import com.erpsom.domain.Producto;
import com.erpsom.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 2/26/17.
 */
@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

    @RequestMapping(
            method = RequestMethod.POST
    )
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
        Producto newProducto = productoRepository.save(producto);
        return new ResponseEntity<>(newProducto, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> updateProducto(@RequestBody Producto producto){
        Producto updProducto = productoRepository.save(producto);
        return  new ResponseEntity<Object>(updProducto, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{codigo}")
    public ResponseEntity<?> getProducto(@PathVariable("codigo") String codigo){
        Producto producto = productoRepository.findByCodigo(codigo);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }
}
