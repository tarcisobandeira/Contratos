package br.com.MBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TemplateMB {

	public int opt = 1;

	public String mudar() {
		if (opt == 1) {
			return "";
		} else if (opt == 2) {
			return "/Template/empresas/Empresas.xhtml";
		} else if (opt == 3) {
			return "/Template/empresas/criarEmpresa.xhtml";
		} else if (opt == 4) {
			return "/Template/contrato/Contrato.xhtml";
		} else if (opt == 5) {
			return "/Template/contrato/criarContrato.xhtml";
		}
		return null;
	}

	public int getOpt() {
		return opt;
	}

	public void setOpt(int opt) {
		this.opt = opt;
	}

}
