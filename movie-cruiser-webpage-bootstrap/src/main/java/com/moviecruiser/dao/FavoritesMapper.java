package com.moviecruiser.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.moviecruiser.model.Favorite;

public class FavoritesMapper implements RowMapper<Favorite> {

	@Override
	public Favorite mapRow(ResultSet rs, int rowNum) throws SQLException {
		Favorite fav = new Favorite();
		fav.setId(rs.getInt(1));
		fav.setName(rs.getString(2));
		fav.setGenre(rs.getString(3));
		return fav;
	}

}
