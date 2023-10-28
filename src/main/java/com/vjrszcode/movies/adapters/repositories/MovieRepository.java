package com.vjrszcode.movies.adapters.repositories;

import com.vjrszcode.movies.core.entities.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> getAll();
    List<Movie> saveAll(List<Movie> movies);
    Movie findById(Long id);
}
