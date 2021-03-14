package com.moviecruiser.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_list")
public class MovieList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_id")
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_boxoffice")
	private Double boxOffice;
	@Column(name = "m_active")
	private String isActive;
	@Column(name = "m_date")
	private Date date;
	@Column(name = "m_genre")
	private String genre;
	@Column(name = "m_teaser")
	private String hasTeaser;
	
	@OneToOne(mappedBy = "movies")
	private Favorite favorite;
	
	public MovieList(int id, String name, Double boxOffice, String isActive, Date date, String genre, String hasTeaser) {
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

	public Double getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(Double boxOffice) {
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
