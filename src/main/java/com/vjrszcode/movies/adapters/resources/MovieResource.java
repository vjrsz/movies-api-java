package com.vjrszcode.movies.adapters.resources;

import com.vjrszcode.movies.adapters.presenters.MoviesPresenter;
import org.springframework.http.ResponseEntity;

public interface MovieResource {
    public ResponseEntity<MoviesPresenter> getAll();

}
