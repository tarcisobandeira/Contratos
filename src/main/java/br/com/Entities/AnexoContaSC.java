package br.com.Entities;

public class AnexoContaSC {
	private Integer id;
	private Integer id_conta_sc;
	private String arquivo;
	private String formato;
	private Conta conta;

	public AnexoContaSC(Integer id, Integer id_conta_sc, String arquivo, String formato) {
		super();
		this.id = id;
		this.id_conta_sc = id_conta_sc;
		this.arquivo = arquivo;
		this.formato = formato;
	}

	public AnexoContaSC() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_conta_sc() {
		return id_conta_sc;
	}

	public void setId_conta_sc(Integer id_conta_sc) {
		this.id_conta_sc = id_conta_sc;
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
