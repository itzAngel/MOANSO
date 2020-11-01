/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.model.Producto;
/**
 *
 * @author angel
 */
public interface ProductoDAO extends Repository<Producto, Integer>{
    
	List<Producto>findAll();
	
	Producto findById(int id);
	
	Producto save(Producto p);
	
	void delete(Producto p);
	
}
