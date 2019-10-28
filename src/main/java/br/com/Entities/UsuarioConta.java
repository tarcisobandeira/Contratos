package br.com.Entities;

public class UsuarioConta {

	private Integer id;
	private Integer id_usuario;
	private Integer id_conta;
	private Usuario usuario;
	private Conta conta;

	public UsuarioConta(Integer id, Integer id_usuario, Integer id_conta) {
		super();
		this.id = id;
		this.id_conta = id_conta;
		this.id_usuario = id_usuario;
	}

	public UsuarioConta() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Integer getId_conta() {
		return id_conta;
	}

	public void setId_conta(Integer id_conta) {
		this.id_conta = id_conta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
