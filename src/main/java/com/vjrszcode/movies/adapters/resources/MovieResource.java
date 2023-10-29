package com.vjrszcode.movies.adapters.resources;

import com.vjrszcode.movies.adapters.presenters.movie.MoviePresenter;
import com.vjrszcode.movies.adapters.presenters.movie.MoviesPresenter;
import org.springframework.http.ResponseEntity;

public interface MovieResource {
    public ResponseEntity<MoviesPresenter> getAll();
    public ResponseEntity<MoviePresenter> getById(Long id);
}
