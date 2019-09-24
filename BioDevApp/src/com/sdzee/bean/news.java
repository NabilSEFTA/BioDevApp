package com.sdzee.bean;

import java.sql.Date;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class news {
	private String titre;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	private String description;
	private String contenu;
	private Date date;
	private String path;
	
	public news(String titre, String description, String contenu, Date date, String path) {
		super();
		this.titre = titre;
		this.description = description;
		this.contenu = contenu;
		this.date= date;
		this.path= path;
		
	}
	public news(String titre, String description, String contenu) {
		super();
		this.titre = titre;
		this.description = description;
		this.contenu = contenu;
		
	}

	
	public news() {
		super();
	}

	public int getjour() {
		if (this.date!= null) return this.date.getDate();
		else return 88;
	}
	
	public String getannee() {
		if (this.date!= null) {
			// input format: MM/yy
			SimpleDateFormat parser = new SimpleDateFormat("yy");
			// output format: yyyy-MM-dd
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
			try {
				 return (formatter.format(parser.parse( Integer.toString(this.date.getYear()))));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "2020";
			} 
			
		}
		else return "1997";
	}
	
	
	public String getmois() {
		if (this.date!= null) {
			DateFormat formatter = new SimpleDateFormat("MMM");
		    GregorianCalendar calendar = new GregorianCalendar();
		    calendar.set(Calendar.DAY_OF_MONTH, 1);
		    calendar.set(Calendar.MONTH,this.date.getMonth());
		    return formatter.format(calendar.getTime());	
			//return new DateFormatSymbols().getMonths()[this.date.getMonth()];
		}
		else return "NOV";
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
}
