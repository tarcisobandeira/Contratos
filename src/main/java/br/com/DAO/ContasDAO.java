package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.Conta;
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

	public List<Conta> listConta(Contrato c) {
		List<Conta> list = new ArrayList<Conta>();
		String sql = " SELECT * FROM Conta WHERE id_contrato = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Conta cc = new Conta();
				cc.setId(rs.getInt("id"));
				cc.setId_contrato(rs.getInt("id_contrato"));
				cc.setValor_pago(rs.getString("valor_pago"));
				cc.setDia_emitido(rs.getString("dia_emitido"));
				cc.setDia_pagamento(rs.getString("dia_pagamento"));
				cc.setStatus_conta(rs.getInt("status_conta"));
				cc.setNota_fiscal(rs.getString("nota_fiscal"));
				cc.setObs(rs.getString("obs"));
				cc.setAtivo(rs.getInt("ativo"));

				list.add(cc);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

}
