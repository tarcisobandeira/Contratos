package br.com.Entities;

public class linkContratoUsuario {
	private Integer id;
	private Integer id_contrato;
	private Integer id_usuario;
	private Contrato contrato;
	private Usuario usuario;

	public linkContratoUsuario(Integer id, Integer id_contrato, Integer id_usuario) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
		this.id_usuario = id_usuario;
	}

	public linkContratoUsuario() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Integer id_contrato) {
		this.id_contrato = id_contrato;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}
