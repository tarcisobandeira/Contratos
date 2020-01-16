package br.com.MBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.Entities.Conta;
import br.com.Entities.Contrato;

@ManagedBean
@ViewScoped
public class ContasMB {

	Contrato c;
	Conta cc = new Conta();

	public Contrato getC() {
		return c;
	}

	public void setC(Contrato c) {
		this.c = c;
	}

	public Conta getCc() {
		return cc;
	}

	public void setCc(Conta cc) {
		this.cc = cc;
	}

}
