package com.moviecruiser.model;

public class Favorite {
	private int id;
	private String name;
	private float boxOffice;
	private String genre;
	
	
	public Favorite(int id, String name, float boxOffice, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.boxOffice = boxOffice;
		this.genre = genre;
	}
	
	public Favorite() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(float boxOffice) {
		this.boxOffice = boxOffice;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
