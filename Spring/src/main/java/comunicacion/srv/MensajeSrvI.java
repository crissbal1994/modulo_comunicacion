package comunicacion.srv;

import comunicacion.beans.Grupo;
import comunicacion.beans.Usuario;

public interface MensajeSrvI {
	public void ingresar(Usuario u, Grupo g, String mensaje) throws Exception;
}
