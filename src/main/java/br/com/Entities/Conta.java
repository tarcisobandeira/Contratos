package br.com.Entities;

public class Conta {
	private Integer id;
	private Integer id_contrato;
	private String valor_pago;
	private String dia_criado;
	private String dia_emitido;
	private String dia_pagamento;
	private Integer status_conta;
	private String nota_fiscal;
	private String obs;
	private Integer ativo;
	private Contrato contrato;

	public Conta(Integer id, Integer id_contrato, String valor_pago, String dia_criado, String dia_emitido,
			String dia_pagamento, Integer status_conta, String nota_fiscal, String obs, Integer ativo) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
		this.valor_pago = valor_pago;
		this.dia_criado = dia_criado;
		this.dia_emitido = dia_emitido;
		this.dia_pagamento = dia_pagamento;
		this.status_conta = status_conta;
		this.nota_fiscal = nota_fiscal;
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

	public String getValor_pago() {
		return valor_pago;
	}

	public void setValor_pago(String valor_pago) {
		this.valor_pago = valor_pago;
	}

	public String getDia_emitido() {
		return dia_emitido;
	}

	public void setDia_emitido(String dia_emitido) {
		this.dia_emitido = dia_emitido;
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

	public String getNota_fiscal() {
		return nota_fiscal;
	}

	public void setNota_fiscal(String nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
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

	public String getDia_criado() {
		return dia_criado;
	}

	public void setDia_criado(String dia_criado) {
		this.dia_criado = dia_criado;
	}

}