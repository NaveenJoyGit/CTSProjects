package com.moviecruiser.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviecruiser.dao.FavoritesDao;
import com.moviecruiser.model.Favorite;

@SpringBootTest
class FavoritesTest {
	
	@Autowired
	FavoritesDao fav;

	@Test
	void testFavorites() {
		fav.addFavorites(3);
	}

	@Test
	void getFavorites() {
		List<Favorite> favList = fav.getFavorites();
		System.out.println(favList.get(0));
	}
	
}
