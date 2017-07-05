package com.legado.comunicacion.dao;

import com.legado.comunicacion.dom.Grupo;
import com.legado.comunicacion.dom.Usuario;

public interface MensajeDAOI {
	public void ingresar(Usuario u, Grupo g, String mensaje) throws Exception;
}
