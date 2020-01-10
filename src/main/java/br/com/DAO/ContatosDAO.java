package br.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Entities.Email;
import br.com.Entities.Empresa;
import br.com.Entities.Financeiro;
import br.com.Entities.Site;
import br.com.Entities.Telefone;
import br.com.jdbc.ConnectionDB;

public class ContatosDAO {

	Connection con;

	public ContatosDAO() {
		con = ConnectionDB.getConnection();
	}

	public boolean insertTelefone(Telefone t) {
		String sql = " INSERT INTO Telefone (id_empresa, telefone) VALUES (?,?) ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, t.getId_empresa());
			ps.setString(2, t.getTelefone());

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public boolean insertEmail(Email em) {
		String sql = " INSERT INTO Email (id_empresa, email) VALUES (?,?) ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId_empresa());
			ps.setString(2, em.getEmail());

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean insertSite(Site s) {
		String sql = " INSERT INTO Site (id_empres, site, usuario, senha) VALUES (?,?,?,?) ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, s.getId_empresa());
			ps.setString(2, s.getSite());
			ps.setString(3, s.getUsuario());
			ps.setString(4, s.getSenha());

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	public boolean insertFinanceiro(Financeiro f) {
		String sql = " INSERT INTO Financeiro (id_empresa, debito_auto, entrega) VALUES (?,?,?) ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, f.getId_empresa());
			ps.setInt(2, f.getDebito_auto());
			ps.setString(3, f.getEntrega());

			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	public List<Telefone> listarTelefone(Empresa em) {
		List<Telefone> list = new ArrayList<Telefone>();
		String sql = " SELECT * FROM Telefone WHERE id_empresa = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Telefone t = new Telefone();
				t.setId(rs.getInt("id"));
				t.setId_empresa(rs.getInt("id_empresa"));
				t.setTelefone(rs.getString("telefone"));

				list.add(t);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public List<Email> listarEmail(Empresa em) {
		List<Email> list = new ArrayList<Email>();
		String sql = " SELECT * FROM Email WHERE id_empresa = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Email e = new Email();
				e.setId(rs.getInt("id"));
				e.setId_empresa(rs.getInt("id_empresa"));
				e.setEmail(rs.getString("email"));

				list.add(e);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public List<Site> litarSite(Empresa em) {
		List<Site> list = new ArrayList<Site>();
		String sql = " SELECT * FROM Site WHERE id_empresa = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Site s = new Site();
				s.setId(rs.getInt("id"));
				s.setId_empresa(rs.getInt("id_empresa"));
				s.setSite(rs.getString("site"));
				s.setUsuario(rs.getString("usuario"));
				s.setSenha(rs.getString("senha"));

				list.add(s);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public List<Financeiro> listarFinanceiro(Empresa em) {
		List<Financeiro> list = new ArrayList<Financeiro>();
		String sql = " SELECT * FROM Financeiro WHERE id_empresa = ? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, em.getId());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Financeiro f = new Financeiro();
				f.setId(rs.getInt("id"));
				f.setId_empresa(rs.getInt("id_empresa"));
				f.setDebito_auto(rs.getInt("debito_auto"));
				f.setEntrega(rs.getString("entrega"));

				list.add(f);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}
}
