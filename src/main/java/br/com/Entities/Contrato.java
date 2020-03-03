package br.com.Entities;

public class Contrato {
	private Integer id;
	private Integer id_empresa;
	private String nome;
	private String descricao;
	private String inicio;
	private String fim;
	private Integer ativo;
	private Empresa empresa;
	private AnexoContrato acontrato;

	public Contrato(Integer id, Integer id_empresa, String nome, String descricao, String inicio, String fim,
			Integer ativo) {
		super();
		this.id = id;
		this.id_empresa = id_empresa;
		this.nome = nome;
		this.descricao = descricao;
		this.inicio = inicio;
		this.fim = fim;
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

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
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

	public AnexoContrato getAcontrato() {
		return acontrato;
	}

	public void setAcontrato(AnexoContrato acontrato) {
		this.acontrato = acontrato;
	}

}
