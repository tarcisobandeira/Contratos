package br.com.Entities;

public class Site {
	private Integer id;
	private Integer id_empresa;
	private String site;
	private String usuario;
	private String senha;
	private Empresa Empresa;

	public Site(Integer id, Integer id_empresa, String site, String usuario, String senha, Contrato contrato) {
		super();
		this.id = id;
		this.id_empresa = id_empresa;
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

	public Integer getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Integer id_empresa) {
		this.id_empresa = id_empresa;
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

	public Empresa getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(Empresa empresa) {
		Empresa = empresa;
	}

}
