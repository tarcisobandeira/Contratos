package br.com.MBean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import br.com.DAO.ContratoDAO;
import br.com.Entities.Contrato;
import br.com.Entities.Empresa;

@ManagedBean
@SessionScoped
public class ContratoMB {

	Empresa em;
	List<Contrato> listC = new ArrayList<Contrato>();
	Contrato c = new Contrato();
	Contrato anexo = new Contrato();
	ContratoDAO cDAO = new ContratoDAO();

	private static String caminho = "C:\\Salvar\\";
	String conteudo;

	Date inicio = new Date();
	Date fim = new Date();
	Date emissao = new Date();
	Date vencimento = new Date();

	public ContratoMB() {
		// TODO Auto-generated constructor stub
	}

	public void criarContrato() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		c.setInicio_c(sdf.format(inicio));
		c.setFim_c(sdf.format(fim));
		c.setDia_emissao_conta(sdf.format(emissao));
		c.setDia_vencimento_conta(sdf.format(vencimento));

		if (cDAO.insert(c, em.getId())) {
			System.out.println("deu");
		} else {
			System.out.println("ndeu");
		}
	}

	public void addAnexo(FileUploadEvent event) {
		UploadedFile upFile = event.getFile();
		File file = new File(caminho, upFile.getFileName());
		try {
			OutputStream out = new FileOutputStream(file);
			try {
				out.write(upFile.getContents());
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

}
