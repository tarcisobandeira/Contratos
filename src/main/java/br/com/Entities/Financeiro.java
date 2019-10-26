package br.com.Entities;

public class Financeiro {

	private Integer id;
	private Integer id_contrato;
	private Integer debito_auto;
	private String entrega;
	private Contrato contrato;

	public Financeiro() {
		// TODO Auto-generated constructor stub
	}

	public Financeiro(Integer id, Integer id_contrato, Integer debito_auto, String entrega) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
		this.debito_auto = debito_auto;
		this.entrega = entrega;
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

	public Integer getDebito_auto() {
		return debito_auto;
	}

	public void setDebito_auto(Integer debito_auto) {
		this.debito_auto = debito_auto;
	}

	public String getEntrega() {
		return entrega;
	}

	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}
