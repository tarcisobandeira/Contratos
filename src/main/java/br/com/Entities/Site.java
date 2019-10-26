package br.com.Entities;

public class Site {
	private Integer id;
	private Integer id_contrato;
	private String site;
	private String usuario;
	private String senha;
	private Contrato contrato;

	public Site(Integer id, Integer id_contrato, String site, String usuario, String senha, Contrato contrato) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
		this.site = site;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Site() {
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

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}
