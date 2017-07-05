package com.legado.comunicacion.dom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grupo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idGrupo;
	private String nombre;
	private int idPeriodoAcademico;
	private int idAsignatura;
	public int getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdPeriodoAcademico() {
		return idPeriodoAcademico;
	}
	public void setIdPeriodoAcademico(int idPeriodoAcademico) {
		this.idPeriodoAcademico = idPeriodoAcademico;
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	
}
