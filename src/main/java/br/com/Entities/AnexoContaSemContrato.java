package br.com.Entities;

public class AnexoContaSemContrato {
	private Integer id;
	private Integer id_conta_sem_contrato;
	private String arquivo;
	private String formato;
	private Conta conta;

	public AnexoContaSemContrato(Integer id, Integer id_conta_sem_contrato, String arquivo, String formato) {
		super();
		this.id = id;
		this.id_conta_sem_contrato = id_conta_sem_contrato;
		this.arquivo = arquivo;
		this.formato = formato;
	}

	public AnexoContaSemContrato() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_conta_sem_contrato() {
		return id_conta_sem_contrato;
	}

	public void setId_conta_sem_contrato(Integer id_conta_sem_contrato) {
		this.id_conta_sem_contrato = id_conta_sem_contrato;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
}
