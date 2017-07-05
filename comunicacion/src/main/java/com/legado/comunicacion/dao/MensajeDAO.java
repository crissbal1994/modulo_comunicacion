package com.legado.comunicacion.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.legado.comunicacion.Rep.MensajeRep;
import com.legado.comunicacion.dom.Grupo;
import com.legado.comunicacion.dom.Usuario;

@Repository
public class MensajeDAO implements MensajeDAOI{
	
	@Autowired
	private DataSource datasource;
	
	public void ingresar(Usuario u, Grupo g, String mensaje) throws Exception{
		String sql="Insert into mensaje(idGrupo,emisor,mensaje) values (?,?,?)";
		Connection con = null;
		try {
			con=datasource.getConnection();
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
	
	public String mostrar() throws Exception{
		String sql="select * from mensaje where id_mensaje=1";
		Connection con = null;
		try {
			con=datasource.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet s=ps.getResultSet();
			String a=s.getString(0);
			ps.executeUpdate();
			ps.close();
			return a;
		} catch (Exception e) {
			throw e;
		}finally {
			if (con!=null)
				con.close();
		}
	}
}
