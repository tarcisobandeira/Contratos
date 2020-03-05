package br.com.MBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.GerarContaDAO;
import br.com.Entities.Conta;
import br.com.Entities.GerarConta;
import br.com.Entities.Status_conta;

@ManagedBean
@ViewScoped
public class GerarContaMB {

	Calendar calendar = new GregorianCalendar();
	SimpleDateFormat sdf;
	ComparadorDataMB cMB = new ComparadorDataMB();
	Conta cc;
	GerarConta editar = new GerarConta();
	GerarConta gc = new GerarConta();
	GerarContaDAO gcDAO = new GerarContaDAO();
	Date pagamento;

	List<GerarConta> listGc = new ArrayList<GerarConta>();
	List<Status_conta> listSC = new ArrayList<Status_conta>();

	public void atualizar() {
		listGc = gcDAO.listarTodos(cc.getId());
	}

	public void criarGc() {
		calendar = new GregorianCalendar();
		sdf = new SimpleDateFormat("MMM/yyyy");
		gc.setId_conta(cc.getId());
		calendar.add(Calendar.MONDAY, 1);
		gc.setMes_ano(sdf.format(calendar.getTime()));
		sdf = new SimpleDateFormat("dd/MMM/yyyy");
		String data = "" + gc.getConta().getDia_vencimento() + "/" + gc.getMes_ano() + "";
		if ((cMB.calcular(sdf.format(calendar.getTime()), data) <= 0)
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

	public void editarGC() {
		if (pagamento != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
			editar.setDia_pagamento(sdf.format(pagamento));
		}
		if (gcDAO.updateGC(editar)) {
			System.out.println("foi update");
		} else {
			System.out.println("nolp");
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

	public ComparadorDataMB getcMB() {
		return cMB;
	}

	public void setcMB(ComparadorDataMB cMB) {
		this.cMB = cMB;
	}

	public GerarConta getEditar() {
		return editar;
	}

	public void setEditar(GerarConta editar) {
		this.editar = editar;
		listSC = gcDAO.listarStatus();
	}

	public Date getPagamento() {
		return pagamento;
	}

	public void setPagamento(Date pagamento) {
		this.pagamento = pagamento;
	}

	public List<Status_conta> getListSC() {
		return listSC;
	}

	public void setListSC(List<Status_conta> listSC) {
		this.listSC = listSC;
	}

}
