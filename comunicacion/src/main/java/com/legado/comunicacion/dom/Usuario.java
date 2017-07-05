package com.legado.comunicacion.dom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUsuario;
	private String nombreCompleto;
	private String UK_correo;
	private String genero;
	private String UK_alias;
	private String contrasenia;
	private String contraseniaSalt;
	private int idCarrera;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getUK_correo() {
		return UK_correo;
	}
	public void setUK_correo(String uK_correo) {
		UK_correo = uK_correo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getUK_alias() {
		return UK_alias;
	}
	public void setUK_alias(String uK_alias) {
		UK_alias = uK_alias;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getContraseniaSalt() {
		return contraseniaSalt;
	}
	public void setContraseniaSalt(String contraseniaSalt) {
		this.contraseniaSalt = contraseniaSalt;
	}
	public int getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}
	
}
