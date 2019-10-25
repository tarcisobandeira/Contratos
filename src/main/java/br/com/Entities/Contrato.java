package br.com.Entities;

public class Contrato {

	private Integer id;
	private String nome;
	private String empresa;
	private String descricao;
	private String inicio_c;
	private String fim_c;
	private float valor_mensal;

	public Contrato() {
		// TODO Auto-generated constructor stub
	}

	public Contrato(Integer id, String nome, String empresa, String descricao, String inicio_c, String fim_c,
			float valor_mensal) {
		super();
		this.id = id;
		this.nome = nome;
		this.empresa = empresa;
		this.descricao = descricao;
		this.inicio_c = inicio_c;
		this.fim_c = fim_c;
		this.valor_mensal = valor_mensal;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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

	public float getValor_mensal() {
		return valor_mensal;
	}

	public void setValor_mensal(float valor_mensal) {
		this.valor_mensal = valor_mensal;
	}

}
