
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.model.Usuario;

/**
*
* @author angel
*/
public interface UsuarioDAO extends Repository<Usuario, Integer>{
	
	List<Usuario>findAll();
	
	Usuario findById(int id);
	
	Usuario save(Usuario u);
	
	void delete(Usuario u);
	
	
}