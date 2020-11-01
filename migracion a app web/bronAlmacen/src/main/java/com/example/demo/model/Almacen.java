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
@Table(name = "almacen")
public class Almacen implements Serializable{
	
	@Id
    @Column(name = "idAlmacen", length = 11)
    private int idAlmacen;
    
	@Column(name = "almacen", length = 45)
	private String almacen;
	
	@Column(name = "direccion", length = 45)
	private String direccion;
	
    @Column(name = "stock", length = 11)
	private int stock;
	
	public Almacen() {
		super();
	}

	public Almacen(int idAlmacen, String almacen, String direccion, int stock) {
		super();
		this.idAlmacen = idAlmacen;
		this.almacen = almacen;
		this.direccion = direccion;
		this.stock = stock;
	}

	public int getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getAlmacen() {
		return almacen;
	}

	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Almacen [idAlmacen=" + idAlmacen + ", almacen=" + almacen + ", direccion=" + direccion + ", stock="
				+ stock + "]";
	}

}
