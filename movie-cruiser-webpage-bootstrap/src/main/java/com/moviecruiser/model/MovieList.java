package com.moviecruiser.model;

import java.sql.Date;

public class MovieList {
	
	private int id;
	private String name;
	private long boxOffice;
	private String isActive;
	private Date date;
	private String genre;
	private String hasTeaser;

	
	public MovieList(int id, String name, long boxOffice, String isActive, Date date, String genre,
			String hasTeaser) {
		super();
		this.id = id;
		this.name = name;
		this.boxOffice = boxOffice;
		this.isActive = isActive;
		this.date = date;
		this.genre = genre;
		this.hasTeaser = hasTeaser;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public MovieList() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(long boxOffice) {
		this.boxOffice = boxOffice;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date2) {
		this.date = date2;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getHasTeaser() {
		return hasTeaser;
	}
	public void setHasTeaser(String hasTeaser) {
		this.hasTeaser = hasTeaser;
	}
	
	
}
