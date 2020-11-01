package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "entrada")
public class Entrada {
	
	@Id
    @Column(name = "idEntrada", length = 11)
    private int idEntrada;
    
	@Temporal( TemporalType.TIMESTAMP)
    @Column(name = "fecha_entrada")
    private Date fechaEntrada;
	
    @Column(name = "cantidad", length = 11)
	private int cantidad;
    
    @ManyToOne()
    @JoinColumn(name = "Almacen_idAlmacen")
    private Almacen almacen;
	
	@ManyToOne()
    @JoinColumn(name = "producto_idproducto")
    private Producto producto;

	public Entrada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entrada(int idEntrada, Date fechaEntrada, int cantidad, Almacen almacen, Producto producto) {
		super();
		this.idEntrada = idEntrada;
		this.fechaEntrada = fechaEntrada;
		this.cantidad = cantidad;
		this.almacen = almacen;
		this.producto = producto;
	}

	public int getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Entrada [idEntrada=" + idEntrada + ", fechaEntrada=" + fechaEntrada + ", cantidad=" + cantidad
				+ ", almacen=" + almacen + ", producto=" + producto + "]";
	}
	
}
