package br.com.MBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.DAO.EmpresaDAO;
import br.com.Entities.Empresa;

@ManagedBean
@SessionScoped
public class EmpresaMB {

	Empresa em = new Empresa();
	EmpresaDAO eDAO = new EmpresaDAO();

	public void criarEmpresa() {
		if (eDAO.insert(em.getNome())) {
			System.out.println("deu");
		} else {
			System.out.println("nolp");
		}
	}

	public Empresa getEm() {
		return em;
	}

	public void setEm(Empresa em) {
		this.em = em;
	}

}
