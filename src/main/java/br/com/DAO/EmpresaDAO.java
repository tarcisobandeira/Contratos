package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.jdbc.ConnectionDB;

public class EmpresaDAO {

	Connection con;

	public EmpresaDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insert(String nome) {
		String sql = " INSERT INTO Empresa (nome, ativo) VALUES (?,?) ";

		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setInt(2, 1);

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
