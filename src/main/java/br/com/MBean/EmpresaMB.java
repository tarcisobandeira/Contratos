package br.com.MBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.DAO.ContatosDAO;
import br.com.DAO.EmpresaDAO;
import br.com.Entities.Email;
import br.com.Entities.Empresa;
import br.com.Entities.Financeiro;
import br.com.Entities.Site;
import br.com.Entities.Telefone;

@ManagedBean
@SessionScoped
public class EmpresaMB {

	int debito;

	Empresa em = new Empresa();
	Empresa empresa;
	Telefone t = new Telefone();
	Email email = new Email();
	Site s = new Site();
	Financeiro f = new Financeiro();

	EmpresaDAO eDAO = new EmpresaDAO();
	ContatosDAO ctDAO = new ContatosDAO();

	List<Empresa> listE = new ArrayList<Empresa>();
	List<Telefone> listT = new ArrayList<Telefone>();
	List<Email> listEm = new ArrayList<Email>();
	List<Site> listS = new ArrayList<Site>();
	List<Financeiro> listF = new ArrayList<Financeiro>();

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

	public void criarEmail() {
		email.setId_empresa(empresa.getId());
		if (ctDAO.insertEmail(email)) {
			System.out.println("deu");
			listEm = ctDAO.listarEmail(empresa);
		} else {
			System.out.println("nolp");
		}
	}

	public void criarSite() {
		s.setId_empresa(empresa.getId());
		if (ctDAO.insertSite(s)) {
			System.out.println("deu");
			listS = ctDAO.listarSite(empresa);
		} else {
			System.out.println("nolp");
		}
	}

	public void criarFinanceiro() {
		f.setId_empresa(empresa.getId());
		f.setDebito_auto(debito);
		if (ctDAO.insertFinanceiro(f)) {
			System.out.println("deu");
			listF = ctDAO.listarFinanceiro(empresa);
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
		listEm = ctDAO.listarEmail(empresa);
		listS = ctDAO.listarSite(empresa);
		listF = ctDAO.listarFinanceiro(empresa);
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

	public List<Email> getListEm() {
		return listEm;
	}

	public void setListEm(List<Email> listEm) {
		this.listEm = listEm;
	}

	public List<Site> getListS() {
		return listS;
	}

	public void setListS(List<Site> listS) {
		this.listS = listS;
	}

	public List<Financeiro> getListF() {
		return listF;
	}

	public void setListF(List<Financeiro> listF) {
		this.listF = listF;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Site getS() {
		return s;
	}

	public void setS(Site s) {
		this.s = s;
	}

	public Financeiro getF() {
		return f;
	}

	public void setF(Financeiro f) {
		this.f = f;
	}

	public int getDebito() {
		return debito;
	}

	public void setDebito(int debito) {
		this.debito = debito;
	}

}
