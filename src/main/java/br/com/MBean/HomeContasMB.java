package br.com.MBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.GerarContaDAO;
import br.com.Entities.GerarConta;

@ManagedBean
@ViewScoped
public class HomeContasMB {

	GerarContaDAO gcDAO = new GerarContaDAO();

	List<GerarConta> listGc = new ArrayList<GerarConta>();

	public HomeContasMB() {
		listGc = gcDAO.listarTodos();
	}

	public GerarContaDAO getGcDAO() {
		return gcDAO;
	}

	public void setGcDAO(GerarContaDAO gcDAO) {
		this.gcDAO = gcDAO;
	}

	public List<GerarConta> getListGc() {
		return listGc;
	}

	public void setListGc(List<GerarConta> listGc) {
		this.listGc = listGc;
	}

}
