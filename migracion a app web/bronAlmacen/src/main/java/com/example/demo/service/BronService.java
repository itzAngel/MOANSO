package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Almacen;
import com.example.demo.model.Categoria;
import com.example.demo.model.Entrada;
import com.example.demo.model.Producto;
import com.example.demo.model.Salida;
import com.example.demo.model.Usuario;

public interface BronService {
	
	//usuario
	List<Usuario> listarusuario();
	
	Usuario listarIdusuario(int id);
	
	Usuario addusuario(Usuario u);
	
	Usuario editusuario(Usuario u);
	
	Usuario deleteusuario(int id);
	
	//almacen
	List<Almacen> listaralmacen();
	
	Almacen listarIdalmacen(int id);
	
	Almacen addalmacen(Almacen a);
	
	Almacen editalmacen(Almacen a);
	
	Almacen deletealmacen(int id);
	
	//categoria
	List<Categoria> listarcategoria();
	
	Categoria listarIdcategoria(int id);
	
	Categoria addcategoria(Categoria c);
	
	Categoria editcategoria(Categoria c);
	
	Categoria deletecategoria(int id);
	
	//producto
	List<Producto> listarproducto();
	
	Producto listarIdproducto(int id);
	
	Producto addproducto(Producto p);
	
	Producto editproducto(Producto p);
	
	Producto deleteproducto(int id);
	
	//entrada
	List<Entrada> listarentrada();
	
	Entrada listarIdentrada(int id);
	
	Entrada addentrada(Entrada p);
	
	Entrada editentrada(Entrada p);
	
	Entrada deleteentrada(int id);
	
	//salida
	List<Salida> listarsalida();
	
	Salida listarIdsalida(int id);
	
	Salida addsalida(Salida p);
	
	Salida editsalida(Salida p);
	
	Salida deletesalida(int id);
	
}
