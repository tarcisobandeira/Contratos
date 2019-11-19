package br.com.MBean;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.FileUploadEvent;

import br.com.DAO.ContratoDAO;
import br.com.Entities.Contrato;
import br.com.Entities.Empresa;

@ManagedBean
@SessionScoped
public class ContratoMB extends UploadDownloadBM {

	Empresa em;
	Contrato anexo = new Contrato();

	List<Contrato> listC = new ArrayList<Contrato>();
	Contrato c = new Contrato();

	ContratoDAO cDAO = new ContratoDAO();

	String conteudo;
	String exec = "Contrato";

	Date inicio;
	Date fim;

	public ContratoMB() {
		// TODO Auto-generated constructor stub
	}

	public void criarContrato() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		c.setInicio_c(sdf.format(inicio));
		c.setFim_c(sdf.format(fim));

		if (cDAO.insert(c, em.getId())) {
			System.out.println("deu");
		} else {
			System.out.println("ndeu");
		}
	}

	public void addAnexo(FileUploadEvent event) {
		// TODO Auto-generated method stub
		File file = super.addAnexo(event, exec);
		if (cDAO.updateArquivo(file, anexo)) {
			System.out.println("FOI");
		} else {
			System.out.println("NOLP");
		}
	}

	public void listarContrato() {
		listC = cDAO.listarContratoIdEmp(em.getId());
	}

	public Empresa getEm() {
		return em;
	}

	public void setEm(Empresa em) {
		this.em = em;
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

	public Contrato getAnexo() {
		return anexo;
	}

	public void setAnexo(Contrato anexo) {
		this.anexo = anexo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

}
