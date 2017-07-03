package comunicacion.dao;

import comunicacion.beans.Grupo;
import comunicacion.beans.Usuario;

public interface MensajeDAOI {
	public void ingresar(Usuario u, Grupo g, String mensaje) throws Exception;
}
