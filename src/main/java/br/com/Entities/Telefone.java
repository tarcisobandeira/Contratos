package br.com.Entities;

public class Telefone {

	private Integer id;
	private Integer id_contrato;
	private String telefone;
	private Contrato contrato;

	public Telefone(Integer id, Integer id_contrato, String telefone) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
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

	public Integer getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Integer id_contrato) {
		this.id_contrato = id_contrato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}
