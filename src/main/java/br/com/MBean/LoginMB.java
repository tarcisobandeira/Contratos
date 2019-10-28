package br.com.MBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.UsuarioDAO;
import br.com.Entities.Usuario;

@ManagedBean
@ViewScoped
public class LoginMB {

	public String login;
	public String senha;

	UsuarioDAO uDAO = new UsuarioDAO();
	Usuario u = new Usuario();

	public LoginMB() {

	}

	public String verificar() {

		u = uDAO.loginUsuario(login);

		if (u != null && u.getSenha().equals(senha)) {
			return "telaPrincipal?faces-redirect=true";
		} else {
			return null;
		}

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
