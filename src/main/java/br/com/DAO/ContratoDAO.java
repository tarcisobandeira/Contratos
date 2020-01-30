package br.com.DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.Contrato;
import br.com.jdbc.ConnectionDB;

public class ContratoDAO {

	Connection con;

	public ContratoDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insert(Contrato c, int id_empresa) {
		String sql = " INSERT INTO Contrato (id_empresa, nome, descricao, inicio_c, fim_c, dia_emissao_conta, dia_vencimento_conta, valor_mensal, arquivo, ativo) VALUES (?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id_empresa);
			ps.setString(2, c.getNome());
			ps.setString(3, c.getDescricao());
			ps.setString(4, c.getInicio_c());
			ps.setString(5, c.getFim_c());
			ps.setString(6, c.getDia_emissao_conta());
			ps.setString(7, c.getDia_vencimento_conta());
			ps.setString(8, c.getValor_mensal());
			ps.setString(9, c.getArquivo());
			ps.setInt(10, 1);

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
		String sql = " SELECT * FROM Contrato ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Contrato c = new Contrato();
				c.setId(rs.getInt("id"));
				c.setId_empresa(rs.getInt("id_empresa"));
				c.setNome(rs.getString("nome"));
				c.setDescricao(rs.getString("descricao"));
				c.setInicio_c(rs.getString("inicio_c"));
				c.setFim_c(rs.getString("fim_c"));
				c.setDia_emissao_conta(rs.getString("dia_emissao_conta"));
				c.setDia_vencimento_conta(rs.getString("dia_vencimento_conta"));
				c.setValor_mensal(rs.getString("valor_mensal"));
				c.setArquivo(rs.getString("arquivo"));
				c.setAtivo(rs.getInt("ativo"));
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
		String sql = " SELECT * FROM Contrato WHERE id_empresa = ? ";

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
				c.setInicio_c(rs.getString("inicio_c"));
				c.setFim_c(rs.getString("fim_c"));
				c.setDia_emissao_conta(rs.getString("dia_emissao_conta"));
				c.setDia_vencimento_conta(rs.getString("dia_vencimento_conta"));
				c.setValor_mensal(rs.getString("valor_mensal"));
				c.setArquivo(rs.getString("arquivo"));
				c.setAtivo(rs.getInt("ativo"));
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public boolean updateArquivo(File file, Contrato c) {
		String sql = " UPDATE Contrato SET arquivo = ? WHERE ID = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, file.toString());
			ps.setInt(2, c.getId());

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
		String sql = " SELECT * FROM Contrato WHERE id_empresa = ? and nome = ? ";

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
				c.setInicio_c(rs.getString("inicio_c"));
				c.setFim_c(rs.getString("fim_c"));
				c.setDia_emissao_conta(rs.getString("dia_emissao_conta"));
				c.setDia_vencimento_conta(rs.getString("dia_vencimento_conta"));
				c.setValor_mensal(rs.getString("valor_mensal"));
				c.setArquivo(rs.getString("arquivo"));
				c.setAtivo(rs.getInt("ativo"));

				return c;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}
}
