package comunicacion.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comunicacion.beans.Grupo;
import comunicacion.beans.Usuario;
import comunicacion.srv.MensajeSrvI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appC = new ClassPathXmlApplicationContext("comunicacion/xml/beans.xml");
        MensajeSrvI ms = (MensajeSrvI) appC.getBean("mensajeSrv");
        Usuario u= new Usuario();
        u.setIdUsuario(1);
        Grupo g = new Grupo();
        g.setIdGrupo(1);
        try {
			ms.ingresar(u, g, "Nuevo Mensaje");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
