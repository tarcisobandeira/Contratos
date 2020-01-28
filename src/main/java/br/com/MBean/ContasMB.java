package br.com.MBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.ContasDAO;
import br.com.Entities.Conta;
import br.com.Entities.Contrato;

@ManagedBean
@ViewScoped
public class ContasMB {

	Contrato c;
	Conta cc = new Conta();
	
	ContasDAO ccDAO = new ContasDAO();
	
	List<Conta> listCC = new ArrayList<Conta>();

	public void atualizar() {
		listCC = ccDAO.listConta(c);
	}
	
	public Contrato getC() {
		return c;
	}

	public void setC(Contrato c) {
		this.c = c;
		atualizar();
	}

	public Conta getCc() {
		return cc;
	}

	public void setCc(Conta cc) {
		this.cc = cc;
	}

}
