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

import com.example.demo.model.Entrada;
import com.example.demo.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/entrada"})
public class EntradaController {
	
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Entrada> listar(){
		return service.listarentrada();
	}
	@PostMapping
	public Entrada agregar(@RequestBody Entrada e) {
		return service.addentrada(e);
	}
	
	@GetMapping("/{id}")
	public Entrada listarId(@PathVariable("id")int id){
		return service.listarIdentrada(id);
	}
	@PutMapping
	public Entrada editar(@RequestBody Entrada e) {
		return service.editentrada(e);
	}
	@DeleteMapping("/{id}")
	public Entrada delete(@PathVariable("id")int id) {
		return service.deleteentrada(id);
	}
}
