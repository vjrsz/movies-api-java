package com.vjrszcode.movies.core.entities.useCases.movies;

import com.vjrszcode.movies.core.entities.Movie;

import java.util.List;

public interface MovieUseCase {
    List<Movie> getAll();
    Movie findById(Long id);
}
