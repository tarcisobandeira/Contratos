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
		} else if (opt == 6) {
			return "/Template/empresas/criarTelefone.xhtml";
		} else if (opt == 7) {
			return "/Template/empresas/criarEmail.xhtml";
		} else if (opt == 8) {
			return "/Template/empresas/criarSite.xhtml";
		} else if (opt == 9) {
			return "/Template/empresas/criarFinanceiro.xhtml";
		} else if (opt == 10) {
			return "/Template/contas/Contas.xhtml";
		} else if (opt == 11) {
			return "/Template/contas/criarConta.xhtml";
		}
		return null;
	}

	public int getOpt() {
		return opt;
	}

	public void setOpt(int opt) {
		this.opt = opt;
		mudar();
	}

}
