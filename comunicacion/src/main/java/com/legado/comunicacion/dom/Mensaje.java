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
	private long idMensaje;
	private long idGrupo;
	private long emisor;
	private Date enviado;
	private String mensaje;
	
	
	public long getIdMensaje() {
		return idMensaje;
	}
	public void setIdMensaje(long idMensaje) {
		this.idMensaje = idMensaje;
	}
	public long getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(long idGrupo) {
		this.idGrupo = idGrupo;
	}
	public long getEmisor() {
		return emisor;
	}
	public void setEmisor(long emisor) {
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
