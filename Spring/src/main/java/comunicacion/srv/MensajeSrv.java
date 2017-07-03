package comunicacion.srv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comunicacion.beans.Grupo;
import comunicacion.beans.Usuario;
import comunicacion.dao.MensajeDAO;
import comunicacion.dao.MensajeDAOI;

@Service
public class MensajeSrv implements MensajeSrvI{
	
	@Autowired
	private MensajeDAOI mensajeDao;
	
	@Override
	public void ingresar(Usuario u, Grupo g, String mensaje) throws Exception{
		try {
			mensajeDao.ingresar(u, g, mensaje);
		} catch (Exception e) {
			throw e;
		}
	}
}
