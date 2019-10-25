package br.com.Entities;

public class Email {

	private Integer id;
	private Integer id_contrato;
	private String email;
	private Contrato contrato;

	public Email(Integer id, Integer id_contrato, String email) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
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

	public Integer getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Integer id_contrato) {
		this.id_contrato = id_contrato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}
