package br.com.Entities;

public class AnexoConta {
	private Integer id;
	private Integer id_conta;
	private String arquivo;
	private Conta conta;

	public AnexoConta(Integer id, Integer id_conta, String arquivo) {
		super();
		this.id = id;
		this.id_conta = id_conta;
		this.arquivo = arquivo;
	}

	public AnexoConta() {
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

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
