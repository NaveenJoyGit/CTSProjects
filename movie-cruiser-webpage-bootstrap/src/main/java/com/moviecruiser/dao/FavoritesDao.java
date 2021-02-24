package com.moviecruiser.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.moviecruiser.model.Favorite;

@Service
public class FavoritesDao {

	@Autowired
	JdbcTemplate jdb;
	
	public void addFavorites(int id) {
		String sql = "insert into favorites(fm_id, us_id) values("+ id +" , " + 1 + ")"; 
		jdb.update(sql);
	}
	
	public List<Favorite> getFavorites() {
		String sql = "select f_id, m_name, m_genre from movie_list m "
				+ "join favorites f on m.m_id = f.fm_id ";
		List<Favorite> favList = jdb.query(sql, new FavoritesMapper());
		return favList;
	}

	public void deleteFavorite(int id) {
		String sql = "delete from favorites where f_id = ?";
		jdb.update(sql, id);
	}
	
}
