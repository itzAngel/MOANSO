package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.model.Salida;

public interface SalidaDAO extends Repository<Salida, Integer>{
	
	List<Salida>findAll();
	
	Salida findById(int id);
	
	Salida save(Salida s);
	
	void delete(Salida s);
}
