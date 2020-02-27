package br.com.MBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.DAO.ContasDAO;
import br.com.DAO.GerarContaDAO;
import br.com.Entities.Conta;
import br.com.Entities.Empresa;
import br.com.Entities.GerarConta;

@ManagedBean
@ViewScoped
public class ContasMB {

	Empresa em;
	GerarConta gc = new GerarConta();
	Conta cc = new Conta();

	Calendar calendar = new GregorianCalendar();
	SimpleDateFormat sdf;

	ContasDAO ccDAO = new ContasDAO();
	GerarContaDAO gcDAO = new GerarContaDAO();

	Date emissao;
	Date vencimento;

	TemplateMB tMB = new TemplateMB();

	List<Conta> listCC = new ArrayList<Conta>();

	public void criarConta() {
		sdf = new SimpleDateFormat("dd");
		cc.setDia_emissao(sdf.format(emissao));
		cc.setDia_vencimento(sdf.format(vencimento));

		cc.setId_empresa(em.getId());

		if (ccDAO.insertConta(cc)) {
			System.out.println("Deu");
			calendar = new GregorianCalendar();
			sdf = new SimpleDateFormat("MMM/yyyy");
			gc.setId_conta(gcDAO.retornoId(cc));
			calendar.add(Calendar.MONDAY, 1);
			gc.setMes_ano(sdf.format(calendar.getTime()));
			if (gcDAO.insert(gc)) {
				System.out.println("Deu");
			} else {
				System.out.println("n deu");
			}
			atualizar();
			tMB.setOpt(10);
			zerar();
		} else {
			System.out.println("n Deu");
		}
	}

	public void atualizar() {
		listCC = ccDAO.listConta(em);
	}

	public void zerar() {
		cc = new Conta();
		emissao = null;
		vencimento = null;
		calendar = new GregorianCalendar();
	}

	public Empresa getEm() {
		return em;
	}

	public void setEm(Empresa em) {
		this.em = em;
		atualizar();
	}

	public Conta getCc() {
		return cc;
	}

	public void setCc(Conta cc) {
		this.cc = cc;
	}

	public ContasDAO getCcDAO() {
		return ccDAO;
	}

	public void setCcDAO(ContasDAO ccDAO) {
		this.ccDAO = ccDAO;
	}

	public List<Conta> getListCC() {
		return listCC;
	}

	public void setListCC(List<Conta> listCC) {
		this.listCC = listCC;
	}

	public Date getEmissao() {
		return emissao;
	}

	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

}
