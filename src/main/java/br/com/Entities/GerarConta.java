package br.com.Entities;

public class GerarConta {
	private Integer id;
	private Integer id_conta;
	private Integer contador;
	private String mes_ano;
	private String dia_pagamento;
	private String valor;
	private boolean referencia;
	private String obs;
	private Integer id_status_conta;
	private Conta conta;
	private Status_conta status_conta;

	public GerarConta(Integer id, Integer id_conta, Integer contador, String mes_ano, String dia_pagamento,
			String valor, Integer id_status_conta, String obs, boolean referencia) {
		super();
		this.id = id;
		this.id_conta = id_conta;
		this.contador = contador;
		this.mes_ano = mes_ano;
		this.dia_pagamento = dia_pagamento;
		this.valor = valor;
		this.referencia = referencia;
		this.obs = obs;
		this.id_status_conta = id_status_conta;
	}

	public GerarConta() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_conta() {
		return id_conta;
	}

	public void setId_conta(Integer id_conta) {
		this.id_conta = id_conta;
	}

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}

	public String getMes_ano() {
		return mes_ano;
	}

	public void setMes_ano(String mes_ano) {
		this.mes_ano = mes_ano;
	}

	public String getDia_pagamento() {
		return dia_pagamento;
	}

	public void setDia_pagamento(String dia_pagamento) {
		this.dia_pagamento = dia_pagamento;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Integer getId_status_conta() {
		return id_status_conta;
	}

	public void setId_status_conta(Integer id_status_conta) {
		this.id_status_conta = id_status_conta;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Status_conta getStatus_conta() {
		return status_conta;
	}

	public void setStatus_conta(Status_conta status_conta) {
		this.status_conta = status_conta;
	}

	public boolean isReferencia() {
		return referencia;
	}

	public void setReferencia(boolean referencia) {
		this.referencia = referencia;
	}

}
