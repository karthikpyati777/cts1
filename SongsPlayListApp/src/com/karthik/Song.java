package com.karthik;

public class Song {
	
	String title;
	double duraation;
	public Song(String title, double duraation) {
		super();
		this.title = title;
		this.duraation = duraation;
	}
	
	public Song() {
		
	}

	public String getTitle() {
		return title;
	}

//	public void setTitle(String title) {
//		this.title = title;
//	}

	public double getDuraation() {
		return duraation;
	}

//	public void setDuraation(double duraation) {
//		this.duraation = duraation;
//	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", duraation=" + duraation + "]";
	}
	
	
	

}
