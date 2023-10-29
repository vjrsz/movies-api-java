package com.vjrszcode.movies.adapters.repositories;

import com.vjrszcode.movies.core.entities.UserMovie;

import java.util.List;

public interface UserMovieRepository {
    List<UserMovie> getAll();
    List<UserMovie> saveAll(List<UserMovie> userMovies);
    UserMovie findById(Long id);
}
