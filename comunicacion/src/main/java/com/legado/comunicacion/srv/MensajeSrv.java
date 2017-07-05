package com.legado.comunicacion.srv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legado.comunicacion.dao.MensajeDAOI;
import com.legado.comunicacion.dom.Grupo;
import com.legado.comunicacion.dom.Usuario;

@Service
public class MensajeSrv implements MensajeSrvI{
	
	@Autowired
	private MensajeDAOI mensajeDao;
	
	public void ingresar(Usuario u, Grupo g, String mensaje) throws Exception{
		try {
			mensajeDao.ingresar(u, g, mensaje);
		} catch (Exception e) {
			throw e;
		}
	}
}
