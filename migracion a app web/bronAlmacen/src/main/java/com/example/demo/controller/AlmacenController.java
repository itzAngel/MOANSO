package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Almacen;
import com.example.demo.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/almacen"})
public class AlmacenController {
	
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Almacen> listar(){
		return service.listaralmacen();
	}
	@PostMapping
	public Almacen agregar(@RequestBody Almacen a) {
		return service.addalmacen(a);
	}
	
	@GetMapping("/{id}")
	public Almacen listarId(@PathVariable("id")int id){
		return service.listarIdalmacen(id);
	}
	@PutMapping
	public Almacen editar(@RequestBody Almacen a) {
		return service.editalmacen(a);
	}
	@DeleteMapping("/{id}")
	public Almacen delete(@PathVariable("id")int id) {
		return service.deletealmacen(id);
	}
}
