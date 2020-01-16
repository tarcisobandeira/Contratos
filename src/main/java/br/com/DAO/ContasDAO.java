package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.Entities.Contrato;
import br.com.jdbc.ConnectionDB;

public class ContasDAO {

	Connection con;

	public ContasDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insertConta(Contrato c) {
		String sql = " INSERT INTO Conta (id_contrato, valor_pago, dia_emitido, dia_pagamento, status_conta, nota_fiscal, obs, ativo) VALUES (?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ps.setString(2, null);
			ps.setString(3, null);
			ps.setString(4, null);
			ps.setInt(5, 1);
			ps.setString(6, null);
			ps.setString(7, null);
			ps.setInt(8, 1);

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

}
