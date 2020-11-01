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

import com.example.demo.model.Categoria;
import com.example.demo.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/categoria"})
public class CategoriaController {
	
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Categoria> listar(){
		return service.listarcategoria();
	}
	@PostMapping
	public Categoria agregar(@RequestBody Categoria c) {
		return service.addcategoria(c);
	}
	
	@GetMapping("/{id}")
	public Categoria listarId(@PathVariable("id")int id){
		return service.listarIdcategoria(id);
	}
	@PutMapping
	public Categoria editar(@RequestBody Categoria c) {
		return service.editcategoria(c);
	}
	@DeleteMapping("/{id}")
	public Categoria delete(@PathVariable("id")int id) {
		return service.deletecategoria(id);
	}
}
