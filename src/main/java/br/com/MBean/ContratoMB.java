package br.com.MBean;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.StreamedContent;

import br.com.DAO.ContratoDAO;
import br.com.Entities.Contrato;
import br.com.Entities.Empresa;

@ManagedBean
@SessionScoped
public class ContratoMB extends UploadDownloadBM {

	Empresa em;
	Contrato anexo = new Contrato();
	boolean show = false;
	private StreamedContent sc;

	List<Contrato> listC = new ArrayList<Contrato>();
	Contrato c = new Contrato();

	ContratoDAO cDAO = new ContratoDAO();

	String conteudo;
	String exec = "Contrato";

	Date inicio;
	Date fim;

	public ContratoMB() {

	}

	public void criarContrato() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		c.setInicio(sdf.format(inicio));
		c.setFim(sdf.format(fim));

		if (cDAO.insert(c, em.getId())) {
			System.out.println("deu Contrato");
			if(cDAO.addArquivo(null, c)) {
				System.out.println("deu arquivo");
			}else {
				System.out.println("no");
			}
		} else {
			System.out.println("ndeu");
		}
	}

	public void addAnexo(FileUploadEvent event) {
		File file = super.addAnexo(event, exec);
		if (cDAO.addArquivo(file, anexo)) {
			System.out.println("FOI");
		} else {
			System.out.println("NOLP");
		}
	}

	public StreamedContent download(String ll) {
		return sc = super.download(anexo.getAcontrato().getArquivo());
	}

	public void atualizar() {
		listC = cDAO.listarContratoIdEmp(em.getId());
		show = false;
	}

	public Empresa getEm() {
		return em;
	}

	public void setEm(Empresa em) {
		this.em = em;
		atualizar();
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

	public StreamedContent getSc() {
		return this.sc;
	}

	public void setSc(StreamedContent sc) {
		this.sc = sc;
	}

	public String getExec() {
		return exec;
	}

	public void setExec(String exec) {
		this.exec = exec;
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
