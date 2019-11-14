package br.com.MBean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

public class UploadDownloadBM {

	private static String caminho = "C:\\Salvar\\";
	String palavra;

	public void addAnexo(FileUploadEvent event) {
		UploadedFile upFile = event.getFile();

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
	}

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

}
