package com.moviecruiser.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="favorites")
public class Favorite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="f_id")
	private int id;
	@Column(name="us_id")
	private int user_id;
	
	@OneToOne
	@JoinColumn(name="fm_id")
	private MovieList movies;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public MovieList getMovies() {
		return movies;
	}
	public void setMovies(MovieList movies) {
		this.movies = movies;
	}
	
	

}
