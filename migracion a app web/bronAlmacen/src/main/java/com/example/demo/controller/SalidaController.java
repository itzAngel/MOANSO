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

import com.example.demo.model.Salida;
import com.example.demo.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/salida"})
public class SalidaController {
	
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Salida> listar(){
		return service.listarsalida();
	}
	@PostMapping
	public Salida agregar(@RequestBody Salida s) {
		return service.addsalida(s);
	}
	
	@GetMapping("/{id}")
	public Salida listarId(@PathVariable("id")int id){
		return service.listarIdsalida(id);
	}
	@PutMapping
	public Salida editar(@RequestBody Salida s) {
		return service.editsalida(s);
	}
	@DeleteMapping("/{id}")
	public Salida delete(@PathVariable("id")int id) {
		return service.deletesalida(id);
	}
}
