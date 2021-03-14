package com.moviecruiser.jpa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviecruiser.model.Favorite;
import com.moviecruiser.model.MovieList;
import com.moviecruiser.service.FavoriteService;
import com.moviecruiser.service.MovieService;

@SpringBootTest
class MovieListTest {

	@Autowired
	MovieService movieService;
	
	@Autowired
	FavoriteService favService;
	
	@Test
	void testGetAllMovies() {
		List<MovieList> mList = movieService.getAllMovies();
		assertEquals("Avatar", mList.get(0).getName());
	}
	
	@Test
	void testFavorite() {
		List<Favorite> fList = favService.getAllFavorites();
		assertEquals("Titanic", fList.get(1).getMovies().getName());
	}

	@Test
	void testAddFavorite() {
		MovieList movie = movieService.getMovieById(4);
		favService.addToFavorite(movie);
	}
	
	@Test
	void testDeleteFavorite() {
		favService.deleteFavorite(48);
	}
}
