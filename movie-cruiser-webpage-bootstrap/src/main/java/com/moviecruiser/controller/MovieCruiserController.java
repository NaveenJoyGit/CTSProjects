package com.moviecruiser.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moviecruiser.dao.FavoritesDao;
import com.moviecruiser.dao.MovieListDao;
import com.moviecruiser.model.MovieList;

@Controller
public class MovieCruiserController {

	@Autowired
	MovieListDao moviedao;
	
	@Autowired
	FavoritesDao favdao;
	
	@RequestMapping(value = "/movie-list-customer", method = RequestMethod.GET)
	public String customerMovieList(ModelMap model, @RequestParam String username) {
		model.put("movieList", moviedao.getMovieList());
		model.put("name", username);
		return "movie-list-customer";
	}
	
	@RequestMapping(value = "/addFavorite", method = RequestMethod.GET)
	public String customerMovieList(@RequestParam int id, ModelMap model) {
		favdao.addFavorites(id);
		model.put("movieList", moviedao.getMovieList());
		return "movie-list-customer";
	}
	
	@RequestMapping(value = "/favorites", method = RequestMethod.GET)
	public String viewFavorites( ModelMap model) {
		model.put("favList", favdao.getFavorites());
		return "favorites";
	}
	
	@RequestMapping(value = "/favorites-notification", method = RequestMethod.GET)
	public String deleteFavorites(@RequestParam int id, ModelMap model) {
		favdao.deleteFavorite(id);
		model.put("favList", favdao.getFavorites());
		return "favorites-notification";
	}
	
	@RequestMapping(value = "/bootstrap", method = RequestMethod.GET)
	public String booystrap() {
		return "bootstrap-example";
	}
	
	@RequestMapping(value = "/movie-list-admin", method = RequestMethod.GET)
	public String adminMovieList(ModelMap model) {
		model.put("movieList", moviedao.getMovieList());
		return "movie-list-admin";
	}
	
	@RequestMapping(value = "/edit-movie", method = RequestMethod.GET)
	public String editMovieListPage(ModelMap model, @RequestParam int id) {
		model.put("editMovie", moviedao.getMovieItemById(id));
		return "edit-movie";
	}
	
	@RequestMapping(value = "/edit-movie-status", method = RequestMethod.POST)
	public String editMovieList(ModelMap model, @RequestParam String title, @RequestParam int id, @RequestParam long gross) {
		moviedao.editMovies(id, title, gross);
		return "edit-movie-status";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/admin-login", method = RequestMethod.GET)
	public String adminLogin() {
		return "admin-login";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {
		return "signup";
	}
	
	@CrossOrigin
	@GetMapping("movie-list")
	@ResponseBody
	public List<MovieList> logout(ModelMap model) {
		List<MovieList> mList =  moviedao.getMovieList();
		return mList;
	}
}
