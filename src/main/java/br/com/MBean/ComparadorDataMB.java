package br.com.MBean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ComparadorDataMB {

	DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
	Calendar c = new GregorianCalendar();

	public long calcular(String inicio, String fim){
		Date dtInicial;
		Date dtFinal;
		try {
			dtInicial = df.parse(inicio);
			dtFinal = df.parse(fim);
			return (dtFinal.getTime() - dtInicial.getTime() + 3600000L) / 86400000L;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
