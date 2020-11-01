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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author angel
 */

@Entity
@Table(name = "producto")
public class Producto implements Serializable{
	
	@Id
    @Column(name = "idproducto", length = 11)
    private int idproducto;
	
    @Column(name = "color", length = 45)
    private String color;
	
    @Column(name = "talla", length = 45)
    private String talla;
	
    @Column(name = "modelo", length = 45)
    private String modelo;
	
    @Column(name = "suela", length = 45)
    private String suela;
	
	@ManyToOne()
    @JoinColumn(name = "idcategoria")
    private Categoria categoria;
	
	@ManyToOne()
    @JoinColumn(name = "usuario_dni_usuario")
    private Usuario usuario;
	
	@Column(name = "stock", length = 11)
    private int stock;
    
	public Producto() {
		super();
	}

	public Producto(int idproducto, String color, String talla, String modelo, String suela, Categoria categoria,
			Usuario usuario, int stock) {
		super();
		this.idproducto = idproducto;
		this.color = color;
		this.talla = talla;
		this.modelo = modelo;
		this.suela = suela;
		this.categoria = categoria;
		this.usuario = usuario;
		this.stock = stock;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSuela() {
		return suela;
	}

	public void setSuela(String suela) {
		this.suela = suela;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", color=" + color + ", talla=" + talla + ", modelo=" + modelo
				+ ", suela=" + suela + ", categoria=" + categoria + ", usuario=" + usuario + ", stock=" + stock + "]";
	}
	
}

