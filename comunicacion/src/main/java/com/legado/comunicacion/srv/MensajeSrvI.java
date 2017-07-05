package com.legado.comunicacion.srv;

import com.legado.comunicacion.dom.Grupo;
import com.legado.comunicacion.dom.Usuario;

public interface MensajeSrvI {
	public void ingresar(Usuario u, Grupo g, String mensaje) throws Exception;
}
