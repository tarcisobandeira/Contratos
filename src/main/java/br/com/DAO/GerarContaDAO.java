package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.Conta;
import br.com.Entities.GerarConta;
import br.com.Entities.Status_conta;
import br.com.jdbc.ConnectionDB;

public class GerarContaDAO {

	Connection con;

	public GerarContaDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insert(GerarConta gc) {
		String sql = " INSERT INTO GerarConta (id_conta, contador, mes_ano, dia_pagamento, valor, referencia, obs, id_status_conta) VALUES (?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, gc.getId_conta());
			ps.setInt(2, contador(gc.getId_conta()));
			ps.setString(3, gc.getMes_ano());
			ps.setString(4, null);
			ps.setString(5, null);
			ps.setBoolean(6, true);
			ps.setString(7, null);
			ps.setInt(8, 1);

			if (ps.executeUpdate() == 1) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateGC(GerarConta gc) {
		String sql = " UPDATE GerarConta SET dia_pagamento = ?, valor = ?, obs = ?, id_status_conta = ? WHERE id = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, gc.getDia_pagamento());
			ps.setString(2, gc.getValor());
			ps.setString(3, gc.getObs());
			ps.setInt(4, gc.getId_status_conta());
			ps.setInt(5, gc.getId());

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public List<GerarConta> listarTodos(Integer i) {
		String sql = " SELECT gc.*, s.descricao AS texto, c.id AS idConta, c.dia_emissao AS diaE, c.dia_vencimento AS diaV "
				+ " FROM GerarConta gc " + " INNER JOIN Status_conta s ON (gc.id_status_conta = s.id) "
				+ " INNER JOIN Conta c ON (gc.id_conta = c.id) " + " WHERE id_conta = ? ";
		List<GerarConta> list = new ArrayList<GerarConta>();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				GerarConta gc = new GerarConta();
				gc.setId(rs.getInt("id"));
				gc.setId_conta(rs.getInt("id_conta"));
				gc.setContador(rs.getInt("contador"));
				gc.setMes_ano(rs.getString("mes_ano"));
				gc.setDia_pagamento(rs.getString("dia_pagamento"));
				gc.setValor(rs.getString("valor"));
				gc.setReferencia(rs.getBoolean("referencia"));
				gc.setObs(rs.getString("obs"));
				gc.setId_status_conta(rs.getInt("id_status_conta"));
				gc.setConta(
						new Conta(rs.getInt("idConta"), null, null, rs.getString("diaE"), rs.getString("diaV"), null));
				gc.setStatus_conta(new Status_conta(rs.getInt("id_status_conta"), rs.getString("texto")));

				list.add(gc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<GerarConta> listarTodos() {
		String sql = " SELECT gc.*, s.descricao AS texto, c.id AS idConta, c.nome AS nome, c.dia_emissao AS diaE, c.dia_vencimento AS diaV "
				+ " FROM GerarConta gc " + " INNER JOIN Status_conta s ON (gc.id_status_conta = s.id) "
				+ " INNER JOIN Conta c ON (gc.id_conta = c.id) ";
		List<GerarConta> list = new ArrayList<GerarConta>();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				GerarConta gc = new GerarConta();
				gc.setId(rs.getInt("id"));
				gc.setId_conta(rs.getInt("id_conta"));
				gc.setContador(rs.getInt("contador"));
				gc.setMes_ano(rs.getString("mes_ano"));
				gc.setDia_pagamento(rs.getString("dia_pagamento"));
				gc.setValor(rs.getString("valor"));
				gc.setReferencia(rs.getBoolean("referencia"));
				gc.setObs(rs.getString("obs"));
				gc.setId_status_conta(rs.getInt("id_status_conta"));
				gc.setConta(new Conta(rs.getInt("idConta"), null, rs.getString("nome"), rs.getString("diaE"),
						rs.getString("diaV"), null));
				gc.setStatus_conta(new Status_conta(rs.getInt("id_status_conta"), rs.getString("texto")));

				list.add(gc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<GerarConta> listarTodosAbertos() {
		String sql = " SELECT gc.*, s.descricao AS texto, c.id AS idConta, c.nome AS nome, c.dia_emissao AS diaE, c.dia_vencimento AS diaV "
				+ " FROM GerarConta gc " + " INNER JOIN Status_conta s ON (gc.id_status_conta = s.id) "
				+ " INNER JOIN Conta c ON (gc.id_conta = c.id) " + " WHERE gc.id_status_conta != 3 ";
		List<GerarConta> list = new ArrayList<GerarConta>();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				GerarConta gc = new GerarConta();
				gc.setId(rs.getInt("id"));
				gc.setId_conta(rs.getInt("id_conta"));
				gc.setContador(rs.getInt("contador"));
				gc.setMes_ano(rs.getString("mes_ano"));
				gc.setDia_pagamento(rs.getString("dia_pagamento"));
				gc.setValor(rs.getString("valor"));
				gc.setReferencia(rs.getBoolean("referencia"));
				gc.setObs(rs.getString("obs"));
				gc.setId_status_conta(rs.getInt("id_status_conta"));
				gc.setConta(new Conta(rs.getInt("idConta"), null, rs.getString("nome"), rs.getString("diaE"),
						rs.getString("diaV"), null));
				gc.setStatus_conta(new Status_conta(rs.getInt("id_status_conta"), rs.getString("texto")));

				list.add(gc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<GerarConta> listarTodosFechado() {
		String sql = " SELECT gc.*, s.descricao AS texto, c.id AS idConta, c.nome AS nome, c.dia_emissao AS diaE, c.dia_vencimento AS diaV "
				+ " FROM GerarConta gc " + " INNER JOIN Status_conta s ON (gc.id_status_conta = s.id) "
				+ " INNER JOIN Conta c ON (gc.id_conta = c.id) " + " WHERE gc.id_status_conta = 3 ";
		List<GerarConta> list = new ArrayList<GerarConta>();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				GerarConta gc = new GerarConta();
				gc.setId(rs.getInt("id"));
				gc.setId_conta(rs.getInt("id_conta"));
				gc.setContador(rs.getInt("contador"));
				gc.setMes_ano(rs.getString("mes_ano"));
				gc.setDia_pagamento(rs.getString("dia_pagamento"));
				gc.setValor(rs.getString("valor"));
				gc.setReferencia(rs.getBoolean("referencia"));
				gc.setObs(rs.getString("obs"));
				gc.setId_status_conta(rs.getInt("id_status_conta"));
				gc.setConta(new Conta(rs.getInt("idConta"), null, rs.getString("nome"), rs.getString("diaE"),
						rs.getString("diaV"), null));
				gc.setStatus_conta(new Status_conta(rs.getInt("id_status_conta"), rs.getString("texto")));

				list.add(gc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public boolean existe(String s, int i) {
		String sql = " SELECT * FROM GerarConta WHERE mes_ano = ? AND id_conta = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s);
			ps.setInt(2, i);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Integer contador(Integer j) {
		String sql = " SELECT COUNT(*) AS contador FROM GerarConta WHERE id_conta = ? ";
		Integer i = null;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, j);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				i = rs.getInt("contador");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		return i;
	}

	public Integer retornoId(Conta cc) {
		String sql = " SELECT cc.id AS ID FROM Conta cc WHERE nome = ? AND id_empresa = ? ";
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cc.getNome());
			ps.setInt(2, cc.getId_empresa());
			ResultSet rs = ps.executeQuery();
			if (rs.first()) {
				i = rs.getInt("ID");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

	public List<Status_conta> listarStatus() {
		List<Status_conta> list = new ArrayList<Status_conta>();
		String sql = " SELECT * FROM status_conta ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Status_conta sc = new Status_conta();
				sc.setId(rs.getInt("id"));
				sc.setDescricao(rs.getString("descricao"));

				list.add(sc);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
