package com.example.demo.dto;

import com.example.demo.model.Almacen;
import com.example.demo.model.Producto;

public class Stock {
	private int idStock;
	private int cantidad;
	private Almacen almacen;
	private Producto producto;
	
	public Stock() {
		super();
	}
	public Stock(int idStock, int cantidad, Almacen almacen, Producto producto) {
		super();
		this.idStock = idStock;
		this.cantidad = cantidad;
		this.almacen = almacen;
		this.producto = producto;
	}
	public int getIdStock() {
		return idStock;
	}
	public void setIdStock(int idStock) {
		this.idStock = idStock;
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
		return "Stock [idStock=" + idStock + ", cantidad=" + cantidad + ", almacen=" + almacen + ", producto="
				+ producto + "]";
	}
	
}
