/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author angel
 */

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	@Id
    @Column(name = "dni_usuario", length = 11)
    private int dniUsuario;
	
    @Column(name = "usuario", length = 45)
    private String usuario;
	
    @Column(name = "contrasena", length = 45)
    private String contrasena;
	
    @Column(name = "nombres", length = 45)
    private String nombres;
	
    @Column(name = "apellidos", length = 45)
    private String apellidos;
    
    @Temporal( TemporalType.TIMESTAMP)
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    
    @Column(name = "telefono", length = 9)
    private String telefono;
	
    @Column(name = "correo", length = 45)
    private String correo;
	
    @Column(name = "tipo_usuario", length = 45)
    private String tipoUsuario;
        
	public Usuario() {
		super();
	}
	
	public Usuario(int dniUsuario, String usuario, String contrasena, String nombres, String apellidos,
			Date fechaNacimiento, String telefono, String correo, String tipoUsuario) {
		super();
		this.dniUsuario = dniUsuario;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.correo = correo;
		this.tipoUsuario = tipoUsuario;
	}

	
	public int getDniUsuario() {
		return dniUsuario;
	}
	public void setDniUsuario(int dniUsuario) {
		this.dniUsuario = dniUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [dniUsuario=" + dniUsuario + ", usuario=" + usuario + ", contrasena=" + contrasena
				+ ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", telefono=" + telefono + ", correo=" + correo + ", tipoUsuario=" + tipoUsuario + "]";
	}
    
    
}
