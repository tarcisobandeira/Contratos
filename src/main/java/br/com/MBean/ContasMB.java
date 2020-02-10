package br.com.MBean;

import java.util.ArrayList;
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

	List<Conta> listCC = new ArrayList<Conta>();

	public void atualizar() {
		listCC = ccDAO.listConta(em);
	}

	public Empresa getEm() {
		return em;
	}

	public void setEm(Empresa em) {
		this.em = em;
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

}
