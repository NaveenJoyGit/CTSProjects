package com.moviecruiser.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviecruiser.dao.MovieListDao;
import com.moviecruiser.model.MovieList;

@SpringBootTest
class MovieDatabaseTest {
	
	@Autowired
	MovieListDao mdao;

	@Test
	void testMovieSelect() {
		List<MovieList> mList = mdao.getMovieList();
		assertEquals("Avatar", mList.get(0).getName());
	}

}
