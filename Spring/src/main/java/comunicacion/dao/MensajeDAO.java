package comunicacion.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comunicacion.beans.Grupo;
import comunicacion.beans.Usuario;

@Repository
public class MensajeDAO implements MensajeDAOI{
	
	@Autowired
	private DataSource dS;
	
	@Override
	public void ingresar(Usuario u, Grupo g, String mensaje) throws Exception{
		String sql="Insert into mensaje(idGrupo,emisor,mensaje) values (?,?,?)";
		Connection con = null;
		try {
			con=dS.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,g.getIdGrupo());
			ps.setInt(2,u.getIdUsuario());
			ps.setString(3, mensaje);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw e;
		}finally {
			if (con!=null)
				con.close();
		}
	}
}
