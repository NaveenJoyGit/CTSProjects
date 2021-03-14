package com.moviecruiser.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviecruiser.model.MovieList;
import com.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRep;
	
	@Transactional
	public List<MovieList> getAllMovies() {
		return movieRep.findAll();
	}
	
	@Transactional
	public MovieList getMovieById(int id) {
		return movieRep.findById(id).get();
	}
	
	@Transactional 
	public void addMovie(MovieList movie) {
		movieRep.save(movie);
	}
	
}
