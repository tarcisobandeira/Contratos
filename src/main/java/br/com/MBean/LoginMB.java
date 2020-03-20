package br.com.MBean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.DAO.UsuarioDAO;
import br.com.Entities.Usuario;

@ManagedBean
@SessionScoped
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
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "", "Usuário ou Senha invalida."));
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

	public UsuarioDAO getuDAO() {
		return uDAO;
	}

	public void setuDAO(UsuarioDAO uDAO) {
		this.uDAO = uDAO;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

}
