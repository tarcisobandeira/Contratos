package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.GerarConta;
import br.com.jdbc.ConnectionDB;

public class GerarContaDAO {

	Connection con;

	public GerarContaDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insert(GerarConta gc) {
		String sql = " INSERT INTO GerarConta (id_conta, contador, mes_ano, dia_pagamento, valor, obs, id_status_conta) VALUES (?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, gc.getId_conta());
			ps.setInt(2, contador(gc.getId_conta()));
			ps.setString(3, gc.getMes_ano());
			ps.setString(4, null);
			ps.setString(5, null);
			ps.setString(6, null);
			ps.setInt(7, 1);

			if (ps.executeUpdate() == 1) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<GerarConta> listarTodos(Integer i) {
		String sql = " SELECT * FROM GerarConta WHERE id_conta = ? ";
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
				gc.setObs(rs.getString("obs"));
				gc.setId_status_conta(rs.getInt("id_status_conta"));

				list.add(gc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public boolean existe(String s) {
		String sql = " SELECT * FROM GerarConta WHERE mes_ano = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s);
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
}
