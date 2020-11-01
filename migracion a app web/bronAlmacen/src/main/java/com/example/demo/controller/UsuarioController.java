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

import com.example.demo.model.Usuario;
import com.example.demo.service.BronService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/usuario"})
public class UsuarioController {
	
	@Autowired
	BronService service;
	
	@GetMapping
	public List<Usuario> listar(){
		return service.listarusuario();
	}
	@PostMapping
	public Usuario agregar(@RequestBody Usuario u) {
		return service.addusuario(u);
	}
	
	@GetMapping("/{id}")
	public Usuario listarId(@PathVariable("id")int id){
		return service.listarIdusuario(id);
	}
	@PutMapping
	public Usuario editar(@RequestBody Usuario u) {
		return service.editusuario(u);
	}
	@DeleteMapping("/{id}")
	public Usuario delete(@PathVariable("id")int id) {
		return service.deleteusuario(id);
	}
}
