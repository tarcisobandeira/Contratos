package br.com.Entities;

public class Empresa {

	private Integer id;
	private String nome;
	private Integer ativo;

	public Empresa(Integer id, String nome, Integer ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
	}

	public Empresa() {
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

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

}
