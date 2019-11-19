package br.com.Entities;

public class Telefone {

	private Integer id;
	private Integer id_empresa;
	private String telefone;
	private Empresa empresa;

	public Telefone(Integer id, Integer id_empresa, String telefone) {
		super();
		this.id = id;
		this.id_empresa = id_empresa;
		this.telefone = telefone;
	}

	public Telefone() {
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
