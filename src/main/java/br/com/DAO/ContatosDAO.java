package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.Email;
import br.com.Entities.Empresa;
import br.com.Entities.Telefone;
import br.com.jdbc.ConnectionDB;

public class ContatosDAO {

	Connection con;

	public ContatosDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insertTelefone(Telefone t) {
		String sql = " INSERT INTO Telefone (id_empresa, telefone) VALUES (?,?) ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, t.getId_empresa());
			ps.setString(2, t.getTelefone());

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public List<Telefone> listarTelefone(Empresa em) {
		List<Telefone> list = new ArrayList<Telefone>();
		String sql = " SELECT * FROM Telefone WHERE id_empresa = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Telefone t = new Telefone();
				t.setId(rs.getInt("id"));
				t.setId_empresa(rs.getInt("id_empresa"));
				t.setTelefone(rs.getString("telefone"));

				list.add(t);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}
	
	public boolean insertEmail(Email em) {
		String sql = " INSERT INTO Email () ";
		
		
		return false;
	}
}
