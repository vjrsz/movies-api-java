package com.vjrszcode.movies.infra.controlllers;

import com.vjrszcode.movies.adapters.presenters.MoviesPresenter;
import com.vjrszcode.movies.adapters.resources.MovieResource;
import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.useCases.movies.GetAllMovieUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
@AllArgsConstructor
public class MovieController implements MovieResource {

    private final GetAllMovieUseCase getAllMovieUseCase;

    @GetMapping
    public ResponseEntity<MoviesPresenter> getAll(){
        MoviesPresenter moviesPresenter = getAllMovieUseCase.execute(null);
        return ResponseEntity.ok().body(moviesPresenter);
    }
}
