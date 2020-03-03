package br.com.DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.AnexoContrato;
import br.com.Entities.Contrato;
import br.com.jdbc.ConnectionDB;

public class ContratoDAO {

	Connection con;

	public ContratoDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insert(Contrato c, int id_empresa) {
		String sql = " INSERT INTO Contrato (id_empresa, nome, descricao, inicio, fim, ativo) VALUES (?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id_empresa);
			ps.setString(2, c.getNome());
			ps.setString(3, c.getDescricao());
			ps.setString(4, c.getInicio());
			ps.setString(5, c.getFim());
			ps.setInt(6, 1);

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	public List<Contrato> listarContrato() {
		List<Contrato> list = new ArrayList<Contrato>();
		String sql = " SELECT c.*, ac.arquivo AS arquivoc FROM Contrato c INNER JOIN AnexoContrato ac ON ac.id_contrato = c.id ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Contrato c = new Contrato();
				c.setId(rs.getInt("id"));
				c.setId_empresa(rs.getInt("id_empresa"));
				c.setNome(rs.getString("nome"));
				c.setDescricao(rs.getString("descricao"));
				c.setInicio(rs.getString("inicio"));
				c.setFim(rs.getString("fim"));
				c.setAtivo(rs.getInt("ativo"));
				c.setAcontrato(new AnexoContrato(null, null, rs.getString("arquivoc")));
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public List<Contrato> listarContratoIdEmp(int id_empresa) {
		List<Contrato> list = new ArrayList<Contrato>();
		String sql = " SELECT c.*, ac.arquivo AS arquivoc FROM Contrato c INNER JOIN AnexoContrato ac ON ac.id_contrato = c.id WHERE id_empresa = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id_empresa);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Contrato c = new Contrato();
				c.setId(rs.getInt("id"));
				c.setId_empresa(rs.getInt("id_empresa"));
				c.setNome(rs.getString("nome"));
				c.setDescricao(rs.getString("descricao"));
				c.setInicio(rs.getString("inicio"));
				c.setFim(rs.getString("fim"));
				c.setAtivo(rs.getInt("ativo"));
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public boolean addArquivo(File file, Contrato c) {
		String sql = " INSERT INTO AnexoContrato (id_contrato, arquivo) VALUES (?,?) ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ps.setString(2, file.toString());

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Contrato listarContratoComId(Contrato contrato) {
		String sql = " SELECT c.*, ac.arquivo AS arquivoc FROM Contrato c INNER JOIN AnexoContrato ac ON ac.id_contrato = c.id WHERE id_empresa = ? AND nome = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, contrato.getId_empresa());
			ps.setString(2, contrato.getNome());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Contrato c = new Contrato();
				c.setId(rs.getInt("id"));
				c.setId_empresa(rs.getInt("id_empresa"));
				c.setNome(rs.getString("nome"));
				c.setDescricao(rs.getString("descricao"));
				c.setInicio(rs.getString("inicio"));
				c.setFim(rs.getString("fim"));
				c.setAtivo(rs.getInt("ativo"));
				c.setAcontrato(new AnexoContrato(null, null, rs.getString("arquivoc")));
				
				return c;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}
}
