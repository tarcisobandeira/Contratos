package br.com.Entities;

public class Pagamento {
	private Integer id;
	private Integer id_contrato;
	private float valor;
	private float valor_pago;
	private String dia_emissao;
	private String dia_vencimento;
	private String dia_pagamento;
	private Integer status_p;
	private String obs;
	private Contrato contrato;

	public Pagamento(Integer id, Integer id_contrato, float valor, float valor_pago, String dia_emissao,
			String dia_vencimento, String dia_pagamento, Integer status_p, String obs) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
		this.valor = valor;
		this.valor_pago = valor_pago;
		this.dia_emissao = dia_emissao;
		this.dia_vencimento = dia_vencimento;
		this.dia_pagamento = dia_pagamento;
		this.status_p = status_p;
		this.obs = obs;
	}

	public Pagamento() {
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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValor_pago() {
		return valor_pago;
	}

	public void setValor_pago(float valor_pago) {
		this.valor_pago = valor_pago;
	}

	public String getDia_emissao() {
		return dia_emissao;
	}

	public void setDia_emissao(String dia_emissao) {
		this.dia_emissao = dia_emissao;
	}

	public String getDia_vencimento() {
		return dia_vencimento;
	}

	public void setDia_vencimento(String dia_vencimento) {
		this.dia_vencimento = dia_vencimento;
	}

	public String getDia_pagamento() {
		return dia_pagamento;
	}

	public void setDia_pagamento(String dia_pagamento) {
		this.dia_pagamento = dia_pagamento;
	}

	public Integer getStatus_p() {
		return status_p;
	}

	public void setStatus_p(Integer status_p) {
		this.status_p = status_p;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}
