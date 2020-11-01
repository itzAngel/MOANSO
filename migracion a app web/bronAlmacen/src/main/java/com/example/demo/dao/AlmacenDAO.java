/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.model.Almacen;

/**
*
* @author angel
*/
public interface AlmacenDAO extends Repository<Almacen, Integer>{   
    
    List<Almacen>findAll();
	
    Almacen findById(int id);
	
    Almacen save(Almacen a);
	
	void delete(Almacen a);
    
}
