package br.com.Entities;

public class ContaSemContrato {

	private Integer id;
	private String nome;
	private String descricao;
	private float valor;
	private float valor_pago;
	private String dia_emitido;
	private String dia_vencimento;
	private String dia_pagamento;
	private Integer status_conta;
	private String obs;
	private String nota_fiscal;
	private Integer ativo;

	public ContaSemContrato(Integer id, String nome, String descricao, float valor, float valor_pago,
			String dia_emitido, String dia_vencimento, String dia_pagamento, Integer status_conta, String obs,
			String nota_fiscal, Integer ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.valor_pago = valor_pago;
		this.dia_emitido = dia_emitido;
		this.dia_vencimento = dia_vencimento;
		this.dia_pagamento = dia_pagamento;
		this.status_conta = status_conta;
		this.obs = obs;
		this.nota_fiscal = nota_fiscal;
		this.ativo = ativo;
	}

	public ContaSemContrato() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public String getDia_emitido() {
		return dia_emitido;
	}

	public void setDia_emitido(String dia_emitido) {
		this.dia_emitido = dia_emitido;
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

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getNota_fiscal() {
		return nota_fiscal;
	}

	public void setNota_fiscal(String nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

}