package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.Empresa;
import br.com.jdbc.ConnectionDB;

public class EmpresaDAO {

	Connection con;

	public EmpresaDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insert(String nome) {
		String sql = " INSERT INTO Empresa (nome, ativo) VALUES (?,?) ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
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

	public List<Empresa> listarEmpresa() {
		List<Empresa> list = new ArrayList<Empresa>();
		String sql = " SELECT * FROM Empresa ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Empresa em = new Empresa();
				em.setId(rs.getInt("id"));
				em.setNome(rs.getString("nome"));
				em.setAtivo(rs.getInt("ativo"));
				list.add(em);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}
}
