/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.model.Categoria;

/**
*
* @author angel
*/
public interface CategoriaDAO extends Repository<Categoria, Integer>{
	
	List<Categoria>findAll();
	
	Categoria findById(int id);
	
	Categoria save(Categoria c);
	
	void delete(Categoria c);
	
}
