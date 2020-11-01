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
@Table(name = "salida")
public class Salida {
	@Id
    @Column(name = "idSalida", length = 11)
    private int idSalida;
    
	@Temporal( TemporalType.TIMESTAMP)
    @Column(name = "fecha_salida")
    private Date fechaSalida;
	
    @Column(name = "cantidad", length = 11)
	private int cantidad;
    
    @ManyToOne()
    @JoinColumn(name = "Almacen_idAlmacen")
    private Almacen almacen;
	
	@ManyToOne()
    @JoinColumn(name = "producto_idproducto")
    private Producto producto;

	public Salida() {
		super();
	}

	public Salida(int idSalida, Date fechaSalida, int cantidad, Almacen almacen, Producto producto) {
		super();
		this.idSalida = idSalida;
		this.fechaSalida = fechaSalida;
		this.cantidad = cantidad;
		this.almacen = almacen;
		this.producto = producto;
	}

	public int getIdSalida() {
		return idSalida;
	}

	public void setIdSalida(int idSalida) {
		this.idSalida = idSalida;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
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
		return "Salida [idSalida=" + idSalida + ", fechaSalida=" + fechaSalida + ", cantidad=" + cantidad + ", almacen="
				+ almacen + ", producto=" + producto + "]";
	}
	
}
