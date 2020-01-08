package br.com.Entities;

public class Email {

	private Integer id;
	private Integer id_empresa;
	private String email;
	private Empresa empresa;

	public Email(Integer id, Integer id_empresa, String email) {
		super();
		this.id = id;
		this.id_empresa = id_empresa;
		this.email = email;
	}

	public Email() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
