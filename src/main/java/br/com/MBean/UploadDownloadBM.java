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
}
