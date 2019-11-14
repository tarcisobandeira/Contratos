package br.com.MBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.DAO.EmpresaDAO;
import br.com.Entities.Empresa;

@ManagedBean
@SessionScoped
public class EmpresaMB {

	Empresa em = new Empresa();
	EmpresaDAO eDAO = new EmpresaDAO();
	List<Empresa> listE = new ArrayList<Empresa>();

	public EmpresaMB() {
		atualizar();
	}

	public void criarEmpresa() {
		if (eDAO.insert(em.getNome())) {
			System.out.println("deu");
			atualizar();
		} else {
			System.out.println("nolp");
		}
	}

	public void atualizar() {
		listE = eDAO.listarEmpresa();
	}

	public Empresa getEm() {
		return em;
	}

	public void setEm(Empresa em) {
		this.em = em;
	}

	public EmpresaDAO geteDAO() {
		return eDAO;
	}

	public void seteDAO(EmpresaDAO eDAO) {
		this.eDAO = eDAO;
	}

	public List<Empresa> getListE() {
		return listE;
	}

	public void setListE(List<Empresa> listE) {
		this.listE = listE;
	}

}
