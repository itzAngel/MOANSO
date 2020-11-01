/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author angel
 */

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
	
	@Id
    @Column(name = "idcategoria", length = 11)
    private int idCategoria;
	
    @Column(name = "categoria", length = 45)
    private String categoria;
	
    @Column(name = "genero", length = 45)
    private String genero;

	public Categoria() {
		super();
	}

	public Categoria(int idCategoria, String categoria, String genero) {
		super();
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.genero = genero;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria + ", genero=" + genero + "]";
	}
    
}
