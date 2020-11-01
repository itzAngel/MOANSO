package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.model.Entrada;

public interface EntradaDAO extends Repository<Entrada, Integer>{
	
	List<Entrada>findAll();
	
	Entrada findById(int id);
	
	Entrada save(Entrada e);
	
	void delete(Entrada e);
}
