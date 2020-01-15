package br.com.Entities;

public class Financeiro {

	private Integer id;
	private Integer id_empresa;
	private Integer debito_auto;
	private String entrega;
	private Empresa empresa;

	public Financeiro() {
		// TODO Auto-generated constructor stub
	}

	public Financeiro(Integer id, Integer id_empresa, Integer debito_auto, String entrega) {
		super();
		this.id = id;
		this.id_empresa = id_empresa;
		this.debito_auto = debito_auto;
		this.entrega = entrega;
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

	public Integer getDebito_auto() {
		return debito_auto;
	}

	public String getFormatDebito_auto() {
		if (debito_auto == 1) {
			return "Sim";
		} else {
			return "Não";
		}
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
