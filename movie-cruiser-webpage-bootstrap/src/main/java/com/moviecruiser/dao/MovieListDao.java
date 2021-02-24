package com.moviecruiser.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.moviecruiser.model.MovieList;

@Service
public class MovieListDao {

	@Autowired
	JdbcTemplate jdb;
	
	public List<MovieList> getMovieList() {
		String sql = "select * from movie_list";
		List<MovieList> movieList = jdb.query(sql, new MovieMapper());
		return movieList;
	}
	
	public MovieList getMovieItemById(int id) {
		String sql = "select * from movie_list where m_id = ?";
		return jdb.queryForObject(sql, new MovieMapper(), id);
	}

	public void editMovies(int id, String title, long gross) {
		String editSql = "update movie_list set m_name = ?, m_boxoffice = ? where m_id = ?";
		jdb.update(editSql, title, gross,id);
	}
	
}
