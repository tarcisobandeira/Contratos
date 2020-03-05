package br.com.MBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TemplateMB {

	public int opt = 1;
	public boolean show = false;

	public String mudar() {
		if (opt == 1) {
			return "/Template/contas/HomeContas.xhtml";
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
		} else if (opt == 12) {
			return "/Template/contas/GerarContas.xhtml";
		} else if (opt == 13) {
			return "/Template/contas/editarGContas.xhtml";
		}
		return null;
	}

	public void mostrar() {
		if (show == false) {
			show = true;
		} else {
			show = false;
		}
	}

	public int getOpt() {
		return opt;
	}

	public void setOpt(int opt) {
		this.opt = opt;
		show = false;
		mudar();
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
