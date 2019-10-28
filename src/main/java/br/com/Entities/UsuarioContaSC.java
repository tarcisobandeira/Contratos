package br.com.Entities;

public class UsuarioContaSC {

	private Integer id;
	private Integer id_usuario;
	private Integer id_conta_sem_contrato;
	private Usuario usuario;
	private ContaSemContrato contaSemContrato;

	public UsuarioContaSC(Integer id, Integer id_usuario, Integer id_conta_sem_contrato) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_conta_sem_contrato = id_conta_sem_contrato;
	}

	public UsuarioContaSC() {
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

	public Integer getId_conta_sem_contrato() {
		return id_conta_sem_contrato;
	}

	public void setId_conta_sem_contrato(Integer id_conta_sem_contrato) {
		this.id_conta_sem_contrato = id_conta_sem_contrato;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ContaSemContrato getContaSemContrato() {
		return contaSemContrato;
	}

	public void setContaSemContrato(ContaSemContrato contaSemContrato) {
		this.contaSemContrato = contaSemContrato;
	}

}
