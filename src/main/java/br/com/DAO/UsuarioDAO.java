package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.Entities.Usuario;
import br.com.jdbc.ConnectionDB;

public class UsuarioDAO {

	Connection con;

	public UsuarioDAO() {
		con = ConnectionDB.getConnection();
	}

	public Usuario loginUsuario(String login) {
		String sql = " SELECT * FROM Usuario WHERE login = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, login);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));

				return u;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
