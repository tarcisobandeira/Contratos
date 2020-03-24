package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.Conta;
import br.com.Entities.Empresa;
import br.com.jdbc.ConnectionDB;

public class ContasDAO {

	Connection con;

	public ContasDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insertConta(Conta cc) {
		String sql = " INSERT INTO Conta (id_empresa, nome, dia_emissao, dia_vencimento, ativo) VALUES (?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cc.getId_empresa());
			ps.setString(2, cc.getNome());
			ps.setString(3, cc.getDia_emissao());
			ps.setString(4, cc.getDia_vencimento());
			ps.setInt(5, 1);

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	public List<Conta> listConta(Empresa em) {
		List<Conta> list = new ArrayList<Conta>();
		String sql = " SELECT * FROM Conta WHERE id_empresa = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Conta cc = new Conta();
				cc.setId(rs.getInt("id"));
				cc.setId_empresa(rs.getInt("id_empresa"));
				cc.setNome(rs.getString("nome"));
				cc.setDia_emissao(rs.getString("dia_emissao"));
				cc.setDia_vencimento(rs.getString("dia_vencimento"));
				cc.setAtivo(rs.getInt("ativo"));

				list.add(cc);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public Conta buscarConta(Conta c) {
		Conta cc = null;
		String sql = " SELECT * FROM Conta WHERE id = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				cc = new Conta();
				cc.setId(rs.getInt("id"));
				cc.setId_empresa(rs.getInt("id_empresa"));
				cc.setNome(rs.getString("nome"));
				cc.setDia_emissao(rs.getString("dia_emissao"));
				cc.setDia_vencimento(rs.getString("dia_vencimento"));
				cc.setAtivo(rs.getInt("ativo"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cc;
	}

	public boolean updateConta(Conta cc) {
		String sql = " UPDATE Conta SET nome = ?, dia_emissao = ?, dia_vencimento = ? WHERE id = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cc.getNome());
			ps.setString(2, cc.getDia_emissao());
			ps.setString(3, cc.getDia_vencimento());
			ps.setInt(4, cc.getId());

			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

}
