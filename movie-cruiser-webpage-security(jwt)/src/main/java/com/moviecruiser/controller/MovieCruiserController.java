package com.moviecruiser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moviecruiser.model.Favorite;
import com.moviecruiser.model.MovieList;
import com.moviecruiser.service.FavoriteService;
import com.moviecruiser.service.MovieService;

@RestController
@CrossOrigin(origins = "*")
public class MovieCruiserController {

	@Autowired
	MovieService movieService;
	
	@Autowired
	FavoriteService favService;
	
	@RequestMapping(value = "/movie-list", method = RequestMethod.GET)
	@ResponseBody
	public List<MovieList> customerMovieList() {
		List<MovieList> mList = movieService.getAllMovies();
		return mList;
	}
	
	@RequestMapping(value = "/favorites", method = RequestMethod.GET)
	@ResponseBody
	public List<Favorite> favorites() {
		return favService.getAllFavorites();
	}

	@CrossOrigin
	@DeleteMapping("/favorites-delete/{id}")
	public List<Favorite> deleteFavorite(@PathVariable int id) {
		favService.deleteFavorite(id);
		return favService.getAllFavorites();
	}

	@PostMapping("/add-favorite")
	public String addFavorite(@RequestBody MovieList movie) {
		favService.addToFavorite(movie);
		return "adding successful";
	}
	
	@GetMapping("/edit/{id}")
	public MovieList editMovieList(@PathVariable int id) {
		return movieService.getMovieById(id);
	}
	
	@CrossOrigin
	@PutMapping("/edit-success")
	public String editMovie(@RequestBody MovieList movie) {
		MovieList m = movieService.getMovieById(movie.getId());
		m.setName(movie.getName());
		m.setBoxOffice(movie.getBoxOffice());
		movieService.addMovie(m);		
		return "edit-successful";
	}
	
}
