package br.com.MBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.ContasDAO;
import br.com.Entities.Conta;
import br.com.Entities.Empresa;

@ManagedBean
@ViewScoped
public class ContasMB {

	Empresa em;
	Conta cc = new Conta();

	ContasDAO ccDAO = new ContasDAO();

	Date emissao;
	Date vencimento;

	List<Conta> listCC = new ArrayList<Conta>();

	public void criarConta() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		cc.setDia_emissao(sdf.format(emissao));
		cc.setDia_vencimento(sdf.format(vencimento));

		cc.setId_empresa(em.getId());

		if (ccDAO.insertConta(cc)) {
			System.out.println("Deu");
			atualizar();
		} else {
			System.out.println("n Deu");
		}
	}

	public void atualizar() {
		listCC = ccDAO.listConta(em);
	}

	public Empresa getEm() {
		return em;
	}

	public void setEm(Empresa em) {
		this.em = em;
		atualizar();
	}

	public Conta getCc() {
		return cc;
	}

	public void setCc(Conta cc) {
		this.cc = cc;
	}

	public ContasDAO getCcDAO() {
		return ccDAO;
	}

	public void setCcDAO(ContasDAO ccDAO) {
		this.ccDAO = ccDAO;
	}

	public List<Conta> getListCC() {
		return listCC;
	}

	public void setListCC(List<Conta> listCC) {
		this.listCC = listCC;
	}

	public Date getEmissao() {
		return emissao;
	}

	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

}
