package com.moviecruiser.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviecruiser.model.Favorite;
import com.moviecruiser.model.MovieList;
import com.moviecruiser.repository.FavoritesRepository;

@Service
public class FavoriteService {

	@Autowired
	FavoritesRepository favRep;
	
	@Transactional
	public List<Favorite> getAllFavorites() {
		return favRep.findAll();
	}
	
	@Transactional
	public void addToFavorite(MovieList movie) {
		Favorite fav = new Favorite();
		fav.setMovies(movie);
		fav.setUser_id(1);
		favRep.save(fav);
	}
	
	@Transactional
	public void deleteFavorite(int id) {
		favRep.deleteById(id);
	}
	
}
