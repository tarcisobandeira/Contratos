package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.Entities.Empresa;
import br.com.Entities.Usuario;
import br.com.jdbc.ConnectionDB;

public class LinkDAO {

	Connection con;

	public LinkDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insert(Empresa em, Usuario u) {
		String sql = " INSERT INTO linkempresausuario (id_empresa, id_usuario) VALUES (?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId());
			ps.setInt(2, u.getId());

			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

}
