package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlmacenDAO;
import com.example.demo.dao.CategoriaDAO;
import com.example.demo.dao.EntradaDAO;
import com.example.demo.dao.ProductoDAO;
import com.example.demo.dao.SalidaDAO;
import com.example.demo.dao.UsuarioDAO;
import com.example.demo.model.Almacen;
import com.example.demo.model.Categoria;
import com.example.demo.model.Entrada;
import com.example.demo.model.Producto;
import com.example.demo.model.Salida;
import com.example.demo.model.Usuario;

@Service
public class BronServiceImpl implements BronService{
	
	@Autowired
	private AlmacenDAO almacenDAO;

	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	private ProductoDAO productoDAO;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private EntradaDAO entradaDAO;
	
	@Autowired
	private SalidaDAO salidaDAO;
	/**
	*
	* usuario
	*/
	@Override
	public List<Usuario> listarusuario() {
		return usuarioDAO.findAll();
	}

	@Override
	public Usuario listarIdusuario(int id) {
		return usuarioDAO.findById(id);
	}

	@Override
	public Usuario addusuario(Usuario u) {
		return usuarioDAO.save(u);
	}

	@Override
	public Usuario editusuario(Usuario u) {
		return usuarioDAO.save(u);
	}

	@Override
	public Usuario deleteusuario(int id) {
		Usuario usuario = listarIdusuario(id);
		usuarioDAO.delete(usuario);
		return usuario;
	}
	
	/**
	*
	* almacen
	*/
	
	@Override
	public List<Almacen> listaralmacen() {
		return almacenDAO.findAll();
	}

	@Override
	public Almacen listarIdalmacen(int id) {
		return almacenDAO.findById(id);
	}

	@Override
	public Almacen addalmacen(Almacen a) {
		return almacenDAO.save(a);
	}

	@Override
	public Almacen editalmacen(Almacen a) {
		return almacenDAO.save(a);
	}

	@Override
	public Almacen deletealmacen(int id) {
		Almacen almacen = listarIdalmacen(id);
		almacenDAO.delete(almacen);
		return almacen;
	}
	
	/**
	*
	* categoria
	*/
	
	@Override
	public List<Categoria> listarcategoria() {
		return categoriaDAO.findAll();
	}

	@Override
	public Categoria listarIdcategoria(int id) {
		return categoriaDAO.findById(id);
	}

	@Override
	public Categoria addcategoria(Categoria c) {
		return categoriaDAO.save(c);
	}

	@Override
	public Categoria editcategoria(Categoria c) {
		return categoriaDAO.save(c);
	}

	@Override
	public Categoria deletecategoria(int id) {
		Categoria categoria = listarIdcategoria(id);
		categoriaDAO.delete(categoria);
		return categoria;
	}
	
	/**
	*
	* producto
	*/
	
	@Override
	public List<Producto> listarproducto() {
		return productoDAO.findAll();
	}

	@Override
	public Producto listarIdproducto(int id) {
		return productoDAO.findById(id);
	}

	@Override
	public Producto addproducto(Producto p) {
		return productoDAO.save(p);
	}

	@Override
	public Producto editproducto(Producto p) {
		return productoDAO.save(p);
	}

	@Override
	public Producto deleteproducto(int id) {
		Producto producto = listarIdproducto(id);
		productoDAO.delete(producto);
		return producto;
	}
	
	/**
	*
	* entrada
	*/
	
	@Override
	public List<Entrada> listarentrada() {
		return entradaDAO.findAll();
	}

	@Override
	public Entrada listarIdentrada(int id) {
		return entradaDAO.findById(id);
	}

	@Override
	public Entrada addentrada(Entrada e) {
		Producto p = e.getProducto();
		p.setStock(p.getStock()+e.getCantidad());
		productoDAO.save(p);
		return entradaDAO.save(e);
	}

	@Override
	public Entrada editentrada(Entrada e) {
		return entradaDAO.save(e);
	}

	@Override
	public Entrada deleteentrada(int id) {
		Entrada entrada = listarIdentrada(id);
		entradaDAO.delete(entrada);
		return entrada;
	}
	
	/**
	*
	* salida
	*/
	
	@Override
	public List<Salida> listarsalida() {
		return salidaDAO.findAll();
	}

	@Override
	public Salida listarIdsalida(int id) {
		return salidaDAO.findById(id);
	}

	@Override
	public Salida addsalida(Salida s) {
		Producto p = s.getProducto();
		p.setStock(p.getStock()-s.getCantidad());
		productoDAO.save(p);
		return salidaDAO.save(s);
	}

	@Override
	public Salida editsalida(Salida s) {
		return salidaDAO.save(s);
	}

	@Override
	public Salida deletesalida(int id) {
		Salida salida = listarIdsalida(id);
		salidaDAO.delete(salida);
		return salida;
	}
	
}
