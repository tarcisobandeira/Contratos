package br.com.MBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.GerarContaDAO;
import br.com.Entities.GerarConta;

@ManagedBean
@ViewScoped
public class HomeContasMB {

	GerarContaDAO gcDAO = new GerarContaDAO();
	Calendar calendar = new GregorianCalendar();
	ComparadorDataMB cMB = new ComparadorDataMB();
	SimpleDateFormat sdf;
	List<GerarConta> listGc = new ArrayList<GerarConta>();
	List<GerarConta> listAberto = new ArrayList<GerarConta>();
	List<GerarConta> listFechados = new ArrayList<GerarConta>();
	List<GerarConta> listPendente = new ArrayList<GerarConta>();

	public HomeContasMB() {
		listGc = gcDAO.listarTodos();
		listAberto = gcDAO.listarTodosAbertos();
		listFechados = gcDAO.listarTodosFechado();
		atualizar();
	}

	public void atualizar() {
		System.out.println("Verificando contas...");
		for (GerarConta gc : listGc) {
			calendar = new GregorianCalendar();
			sdf = new SimpleDateFormat("dd/MMM/yyyy");
			String data = "" + gc.getConta().getDia_vencimento() + "/" + gc.getMes_ano() + "";
			if ((cMB.calcular(sdf.format(calendar.getTime()), data) <= 0)
					&& (!gcDAO.existe(gc.getMes_ano(), gc.getId_conta()))) {
				sdf = new SimpleDateFormat("MMM/yyyy");
				calendar.add(Calendar.MONDAY, 1);
				gc.setMes_ano(sdf.format(calendar.getTime()));
				if (gcDAO.insert(gc)) {
					System.out.println("Deu");
				} else {
					System.out.println("n deu");
				}
			}
		}
		System.out.println("Contas verificadas.");
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

	public List<GerarConta> getListAberto() {
		return listAberto;
	}

	public void setListAberto(List<GerarConta> listAberto) {
		this.listAberto = listAberto;
	}

	public List<GerarConta> getListFechados() {
		return listFechados;
	}

	public void setListFechados(List<GerarConta> listFechados) {
		this.listFechados = listFechados;
	}

	public List<GerarConta> getListPendente() {
		return listPendente;
	}

	public void setListPendente(List<GerarConta> listPendente) {
		this.listPendente = listPendente;
	}

}
