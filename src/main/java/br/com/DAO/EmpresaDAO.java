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

	public boolean insert(Empresa em) {
		String sql = " INSERT INTO Empresa (nome, tipo, ativo) VALUES (?,?,?) ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, em.getNome());
			ps.setInt(2, em.getTipo());
			ps.setInt(3, 1);

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
				em.setTipo(rs.getInt("tipo"));
				em.setAtivo(rs.getInt("ativo"));
				list.add(em);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public Empresa buscarEmpresa(int id) {
		String sql = " SELECT * FROM Empresa WHERE id = ? ";
		Empresa em = new Empresa();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				em.setId(rs.getInt("id"));
				em.setNome(rs.getString("nome"));
				em.setTipo(rs.getInt("tipo"));
				em.setAtivo(rs.getInt("ativo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return em;
	}

	public boolean updateEmpresa(Empresa em) {
		String sql = " UPDATE Empresa SET nome = ?, tipo = ? WHERE id = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, em.getNome());
			ps.setInt(2, em.getTipo());
			ps.setInt(3, em.getId());

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean buscarEmpresaNome(Empresa em) {
		String sql = " SELECT * FROM Empresa WHERE nome = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, em.getNome());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
}
