package br.com.Entities;

public class Conta {
	private Integer id;
	private Integer id_contrato;
	private float valor_pago;
	private String dia_emissao;
	private String dia_vencimento;
	private String dia_pagamento;
	private Integer status_conta;
	private String note_fiscal;
	private String obs;
	private Integer ativo;
	private Contrato contrato;

	public Conta(Integer id, Integer id_contrato, float valor_pago, String dia_emissao, String dia_vencimento,
			String dia_pagamento, Integer status_conta, String nota_fiscal, String obs, Integer ativo) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
		this.valor_pago = valor_pago;
		this.dia_emissao = dia_emissao;
		this.dia_vencimento = dia_vencimento;
		this.dia_pagamento = dia_pagamento;
		this.status_conta = status_conta;
		this.note_fiscal = nota_fiscal;
		this.ativo = ativo;
		this.obs = obs;
	}

	public Conta() {
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

	public Integer getStatus_conta() {
		return status_conta;
	}

	public void setStatus_conta(Integer status_conta) {
		this.status_conta = status_conta;
	}

	public String getNote_fiscal() {
		return note_fiscal;
	}

	public void setNote_fiscal(String note_fiscal) {
		this.note_fiscal = note_fiscal;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

}