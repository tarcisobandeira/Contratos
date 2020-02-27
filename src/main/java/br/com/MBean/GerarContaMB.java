package br.com.MBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.GerarContaDAO;
import br.com.Entities.Conta;
import br.com.Entities.GerarConta;

@ManagedBean
@ViewScoped
public class GerarContaMB {

	Calendar calendar = new GregorianCalendar();
	SimpleDateFormat sdf;

	Conta cc;
	GerarConta gc = new GerarConta();
	GerarContaDAO gcDAO = new GerarContaDAO();

	List<GerarConta> listGc = new ArrayList<GerarConta>();

	public void atualizar() {
		listGc = gcDAO.listarTodos(cc.getId());
	}

	public void criarGc() {
		calendar = new GregorianCalendar();
		sdf = new SimpleDateFormat("MMM/yyyy");
		gc.setId_conta(cc.getId());
		calendar.add(Calendar.MONDAY, 1);
		gc.setMes_ano(sdf.format(calendar.getTime()));
		sdf = new SimpleDateFormat("dd");
		if ((cc.getDia_emissao().equals(sdf.format(calendar.getTime())))
				&& (!gcDAO.existe(gc.getMes_ano(), gc.getId_conta()))) {
			if (gcDAO.insert(gc)) {
				System.out.println("Deu");
			} else {
				System.out.println("n deu");
			}
		} else {
			System.out.println("Já existe");
		}
	}

	public Conta getCc() {
		return cc;
	}

	public void setCc(Conta cc) {
		this.cc = cc;
		atualizar();
	}

	public GerarConta getGc() {
		return gc;
	}

	public void setGc(GerarConta gc) {
		this.gc = gc;
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

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

}
