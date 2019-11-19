package br.com.MBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.DAO.ContatosDAO;
import br.com.DAO.EmpresaDAO;
import br.com.Entities.Empresa;
import br.com.Entities.Telefone;

@ManagedBean
@SessionScoped
public class EmpresaMB {

	Empresa em = new Empresa();
	Empresa empresa;
	Telefone t = new Telefone();

	EmpresaDAO eDAO = new EmpresaDAO();
	ContatosDAO ctDAO = new ContatosDAO();

	List<Empresa> listE = new ArrayList<Empresa>();
	List<Telefone> listT = new ArrayList<Telefone>();

	boolean mostrar = false;

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

	public void criarTelefone() {
		t.setId_empresa(empresa.getId());
		if (ctDAO.insertTelefone(t)) {
			System.out.println("deu");
			listT = ctDAO.listarTelefone(empresa);
		} else {
			System.out.println("nolp");
		}
	}

	public void atualizar() {
		listE = eDAO.listarEmpresa();
		mostrar = false;
	}

	public void atualizarContato() {
		listT = ctDAO.listarTelefone(empresa);
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

	public Telefone getT() {
		return t;
	}

	public void setT(Telefone t) {
		this.t = t;
	}

	public ContatosDAO getCtDAO() {
		return ctDAO;
	}

	public void setCtDAO(ContatosDAO ctDAO) {
		this.ctDAO = ctDAO;
	}

	public List<Telefone> getListT() {
		return listT;
	}

	public void setListT(List<Telefone> listT) {
		this.listT = listT;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
		atualizarContato();
	}

	public boolean isMostrar() {
		return mostrar;
	}

	public void setMostrar(boolean mostrar) {
		this.mostrar = mostrar;
	}

}
