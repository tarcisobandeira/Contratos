package br.com.Entities;

public class GerarConta {
	private Integer id;
	private Integer id_gerarConta;
	private Integer contador;
	private String mes_ano;
	private String valor;
	private String obs;
	private Integer status_conta;
	private Conta conta;

	public GerarConta(Integer id, Integer id_gerarConta, Integer contador, String mes_ano, String valor,
			Integer status_conta, String obs) {
		super();
		this.id = id;
		this.id_gerarConta = id_gerarConta;
		this.contador = contador;
		this.mes_ano = mes_ano;
		this.valor = valor;
		this.obs = obs;
		this.status_conta = status_conta;
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

	public Integer getId_gerarConta() {
		return id_gerarConta;
	}

	public void setId_gerarConta(Integer id_gerarConta) {
		this.id_gerarConta = id_gerarConta;
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

	public Integer getStatus_conta() {
		return status_conta;
	}

	public void setStatus_conta(Integer status_conta) {
		this.status_conta = status_conta;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
