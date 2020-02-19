package br.com.Entities;

public class Status_conta {

	private Integer id;
	private String descricao;

	public Status_conta(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Status_conta() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
