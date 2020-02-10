package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.Conta;
import br.com.Entities.Contrato;
import br.com.Entities.Empresa;
import br.com.jdbc.ConnectionDB;

public class ContasDAO {

	Connection con;

	public ContasDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insertConta(Contrato c, String d) {
		String sql = " INSERT INTO Conta (id_empresa, contador, nome, mes_ano, dia_emissao, dia_vencimento, valor, obs, ativo) VALUES (?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ps.setString(2, null);
			ps.setString(3, d);
			ps.setString(4, null);
			ps.setString(5, null);
			ps.setInt(6, 1);
			ps.setString(7, null);
			ps.setString(8, null);
			ps.setInt(9, 1);

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
		String sql = " SELECT * FROM Conta WHERE id_contrato = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Conta cc = new Conta();
				cc.setId(rs.getInt("id"));
				cc.setId_empresa(rs.getInt("id_empresa"));
				cc.setContador(rs.getInt("contador"));
				cc.setNome(rs.getString("nome"));
				cc.setMes_ano(rs.getString("mes_ano"));
				cc.setDia_emissao(rs.getString("dia_emissao"));
				cc.setDia_vencimento(rs.getString("dia_vencimento"));
				cc.setValor(rs.getString("valor"));
				cc.setObs(rs.getString("obs"));
				cc.setStatus_conta(rs.getInt("status_conta"));
				cc.setAtivo(rs.getInt("ativo"));

				list.add(cc);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}
	
	public int contador() {
		int i = 
		return i++;
	}

}
