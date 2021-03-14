package com.moviecruiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviecruiser.model.MovieList;

@Repository
public interface MovieRepository extends JpaRepository<MovieList, Integer> {

}
