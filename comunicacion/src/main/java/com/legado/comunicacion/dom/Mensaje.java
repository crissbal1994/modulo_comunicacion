package com.legado.comunicacion.dom;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMensaje;
	private Grupo idGrupo;
	private Usuario emisor;
	private Date enviado;
	private String mensaje;
	public int getIdMensaje() {
		return idMensaje;
	}
	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}
	public Grupo getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(Grupo idGrupo) {
		this.idGrupo = idGrupo;
	}
	public Usuario getEmisor() {
		return emisor;
	}
	public void setEmisor(Usuario emisor) {
		this.emisor = emisor;
	}
	public Date getEnviado() {
		return enviado;
	}
	public void setEnviado(Date enviado) {
		this.enviado = enviado;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
