package br.com.MBean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

@ManagedBean
@ViewScoped
public class UploadDownloadBM {

	private static String local = "C:\\Anexos\\";
	String palavra;

	public File addAnexo(FileUploadEvent event, String exec) {
		UploadedFile upFile = event.getFile();

		File caminho = new File(local + exec);

		testeCaminho(caminho);

		File file = new File(caminho, trocaNomeFile(upFile.getFileName()));
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
		return file;
	}

	public void testeCaminho(File caminho) {
		if (!caminho.exists()) {
			caminho.mkdirs();
			System.out.println("Diretório criado.");
		} else {
			System.out.println("Diretório já existe.");
		}
	};

	public String trocaNomeFile(String arquivo) {
		String nome = null;
		String arquivoN = arquivo.replace('.', '#');
		String[] s = arquivoN.split("#");

		for (int i = 0; i < s.length; i++) {
			palavra = s[i].trim();
		}

		long l = Calendar.getInstance().getTimeInMillis();

		nome = l + "." + palavra;
		return nome;
	}

	public StreamedContent download(String ll) {
		InputStream in;
		try {
			in = new FileInputStream(new File(ll));
			StreamedContent a = new DefaultStreamedContent(in, pegarExtensao(ll), pegarNome(ll));
			return a;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String pegarExtensao(String arquivo) {
		String ex = null;
		String arquivoN = arquivo.replace('.', '#');
		String[] s = arquivoN.split("#");

		for (int i = 0; i < s.length; i++) {
			ex = s[i].trim();
		}

		if (ex.equals("png")) {
			return "image/png";
		} else if (ex.equals("jpg") || (ex.equals("jpeg"))) {
			return "image/jpg";
		} else if (ex.equals("pdf")) {
			return "application/pdf";
		}
		return null;
	}

	public String pegarNome(String arquivo) {
		String nome = null;
		String arquivoN = arquivo.replace('\\', '#');
		String[] s = arquivoN.split("#");

		for (int i = 0; i < s.length; i++) {
			nome = s[i].trim();
		}
		return nome;
	}

	public static String getLocal() {
		return local;
	}

	public static void setLocal(String local) {
		UploadDownloadBM.local = local;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
}
