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
	SimpleDateFormat sdf;
	List<GerarConta> listGc = new ArrayList<GerarConta>();

	public HomeContasMB() {
		listGc = gcDAO.listarTodos();
		atualizar();
	}

	public void atualizar() {
		System.out.println("Verificando contas...");
		for(GerarConta gc : listGc) {
			calendar = new GregorianCalendar();
			sdf = new SimpleDateFormat("dd");
			if ((gc.getConta().getDia_emissao().equals(sdf.format(calendar.getTime())))	&& (!gcDAO.existe(gc.getMes_ano(), gc.getId_conta()))) {
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

}
