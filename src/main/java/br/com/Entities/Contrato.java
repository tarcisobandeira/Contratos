package br.com.Entities;

public class Contrato {

	private Integer id;
	private Integer id_empresa;
	private String nome;
	private String descricao;
	private String inicio_c;
	private String fim_c;
	private String dia_emissao_conta;
	private String dia_vencimento_conta;
	private String valor_mensal;
	private String arquivo;
	private Integer ativo;
	private Empresa empresa;

	public Contrato(Integer id, Integer id_empresa, String nome, String descricao, String inicio_c, String fim_c,
			String dia_emissao_conta, String dia_vencimento_conta, String valor_mensal, String arquivo, Integer ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.inicio_c = inicio_c;
		this.fim_c = fim_c;
		this.dia_emissao_conta = dia_emissao_conta;
		this.dia_vencimento_conta = dia_vencimento_conta;
		this.valor_mensal = valor_mensal;
		this.arquivo = arquivo;
		this.ativo = ativo;
	}

	public Contrato() {
		// TODO Auto-generated constructor stub
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

	public String getInicio_c() {
		return inicio_c;
	}

	public void setInicio_c(String inicio_c) {
		this.inicio_c = inicio_c;
	}

	public String getFim_c() {
		return fim_c;
	}

	public void setFim_c(String fim_c) {
		this.fim_c = fim_c;
	}

	public String getDia_emissao_conta() {
		return dia_emissao_conta;
	}

	public void setDia_emissao_conta(String dia_emissao_conta) {
		this.dia_emissao_conta = dia_emissao_conta;
	}

	public String getDia_vencimento_conta() {
		return dia_vencimento_conta;
	}

	public void setDia_vencimento_conta(String dia_vencimento_conta) {
		this.dia_vencimento_conta = dia_vencimento_conta;
	}

	public String getValor_mensal() {
		return valor_mensal;
	}

	public void setValor_mensal(String valor_mensal) {
		this.valor_mensal = valor_mensal;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
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

}
