package br.com.MBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.DAO.ContratoDAO;
import br.com.Entities.Contrato;

@ManagedBean
@SessionScoped
public class ContratoMB {

	int id_empresa;
	List<Contrato> listC = new ArrayList<Contrato>();
	Contrato c = new Contrato();
	ContratoDAO cDAO = new ContratoDAO();

	public ContratoMB() {
		// TODO Auto-generated constructor stub
	}

	public void listarContrato() {
		listC = cDAO.listarContratoIdEmp(id_empresa);
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
		listarContrato();
	}

	public List<Contrato> getListC() {
		return listC;
	}

	public void setListC(List<Contrato> listC) {
		this.listC = listC;
	}

	public Contrato getC() {
		return c;
	}

	public void setC(Contrato c) {
		this.c = c;
	}

	public ContratoDAO getcDAO() {
		return cDAO;
	}

	public void setcDAO(ContratoDAO cDAO) {
		this.cDAO = cDAO;
	}

}
