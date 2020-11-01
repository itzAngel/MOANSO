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

import com.example.demo.model.Producto;
import com.example.demo.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/producto"})
public class ProductoController {
	
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Producto> listar(){
		return service.listarproducto();
	}
	@PostMapping
	public Producto agregar(@RequestBody Producto p) {
		return service.addproducto(p);
	}
	
	@GetMapping("/{id}")
	public Producto listarId(@PathVariable("id")int id){
		return service.listarIdproducto(id);
	}
	@PutMapping
	public Producto editar(@RequestBody Producto p) {
		return service.editproducto(p);
	}
	@DeleteMapping("/{id}")
	public Producto delete(@PathVariable("id")int id) {
		return service.deleteproducto(id);
	}
}
