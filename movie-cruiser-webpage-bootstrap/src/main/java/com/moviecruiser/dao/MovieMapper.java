package com.moviecruiser.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.moviecruiser.model.MovieList;

public class MovieMapper implements RowMapper<MovieList> {

	@Override
	public MovieList mapRow(ResultSet rs, int rowNum) throws SQLException {
		MovieList mList = new MovieList();
		mList.setId(rs.getInt(1));
		mList.setName(rs.getString(2));
		mList.setBoxOffice(rs.getLong(3));
		mList.setGenre(rs.getString(6));
		mList.setHasTeaser(rs.getString(7));
		mList.setDate(rs.getDate(5));
		mList.setIsActive(rs.getString(4));
		return mList;
	}

}
