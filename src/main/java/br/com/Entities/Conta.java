package br.com.Entities;

public class Conta {
	private Integer id;
	private Integer id_emprego;
	private Integer contador;
	private String nome;
	private String mes_ano;
	private String dia_emissao;
	private String dia_vencimento;
	private String valor;
	private String obs;
	private Integer status_conta;
	private Integer ativo;
	private Empresa empresa;

	public Conta(Integer id, Integer id_emprego, Integer contador, String nome, String mes_ano, String dia_emissao,
			String dia_vencimento, String valor, Integer status_conta, String obs, Integer ativo) {
		super();
		this.id = id;
		this.id_emprego = id_emprego;
		this.contador = contador;
		this.nome = nome;
		this.mes_ano = mes_ano;
		this.dia_emissao = dia_emissao;
		this.dia_vencimento = dia_vencimento;
		this.valor = valor;
		this.status_conta = status_conta;
		this.obs = obs;
		this.ativo = ativo;
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

	public Integer getId_emprego() {
		return id_emprego;
	}

	public void setId_emprego(Integer id_emprego) {
		this.id_emprego = id_emprego;
	}

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMes_ano() {
		return mes_ano;
	}

	public void setMes_ano(String mes_ano) {
		this.mes_ano = mes_ano;
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

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Integer getStatus_conta() {
		return status_conta;
	}

	public void setStatus_conta(Integer status_conta) {
		this.status_conta = status_conta;
	}

}
