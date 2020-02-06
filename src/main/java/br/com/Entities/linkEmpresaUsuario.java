package br.com.Entities;

public class linkEmpresaUsuario {
	private Integer id;
	private Integer id_empresa;
	private Integer id_usuario;
	private Empresa empresa;
	private Usuario usuario;

	public linkEmpresaUsuario(Integer id, Integer id_empresa, Integer id_usuario) {
		super();
		this.id = id;
		this.id_empresa = id_empresa;
		this.id_usuario = id_usuario;
	}

	public linkEmpresaUsuario() {
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

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
