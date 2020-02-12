package br.com.Entities;

public class Conta {
	private Integer id;
	private Integer id_empresa;
	private String nome;
	private String dia_emissao;
	private String dia_vencimento;
	private Integer ativo;
	private Empresa empresa;

	public Conta(Integer id, Integer id_empresa, String nome, String dia_emissao, String dia_vencimento,
			Integer ativo) {
		super();
		this.id = id;
		this.id_empresa = id_empresa;
		this.nome = nome;
		this.dia_emissao = dia_emissao;
		this.dia_vencimento = dia_vencimento;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Integer getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Integer id_empresa) {
		this.id_empresa = id_empresa;
	}

}
