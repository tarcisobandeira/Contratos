package br.com.Entities;

public class AnexoContrato {
	private Integer id;
	private Integer id_contrato;
	private String arquivo;
	private Conta conta;

	public AnexoContrato(Integer id, Integer id_contrato, String arquivo) {
		super();
		this.id = id;
		this.id_contrato = id_contrato;
		this.arquivo = arquivo;
	}

	public AnexoContrato() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Integer id_contrato) {
		this.id_contrato = id_contrato;
	}

}
