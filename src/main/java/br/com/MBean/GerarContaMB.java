package br.com.MBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.Entities.Conta;

@ManagedBean
@ViewScoped
public class GerarContaMB {

	Conta cc;
	
	public void atualizar() {
		
	}

	public Conta getCc() {
		return cc;
	}

	public void setCc(Conta cc) {
		this.cc = cc;
		atualizar();
	}

}
