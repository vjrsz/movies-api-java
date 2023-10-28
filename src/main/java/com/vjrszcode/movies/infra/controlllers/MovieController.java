package com.vjrszcode.movies.infra.controlllers;

import com.vjrszcode.movies.adapters.presenters.MoviePresenter;
import com.vjrszcode.movies.adapters.presenters.MoviesPresenter;
import com.vjrszcode.movies.adapters.resources.MovieResource;
import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.useCases.UseCase;
import com.vjrszcode.movies.core.useCases.movies.GetAllMovieUseCase;
import com.vjrszcode.movies.core.useCases.movies.GetByIdMovieUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
@AllArgsConstructor
public class MovieController implements MovieResource {

    private final GetAllMovieUseCase getAllMovieUseCase;
    private final GetByIdMovieUseCase getByIdMovieUseCase;

    @GetMapping
    public ResponseEntity<MoviesPresenter> getAll(){
        MoviesPresenter moviesPresenter = MoviesPresenter.fromListMovies(getAllMovieUseCase.execute(new GetAllMovieUseCase.InputValues()).getMovies());

        return ResponseEntity.ok().body(moviesPresenter);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MoviePresenter> getById(@PathVariable Long id){
        MoviePresenter moviePresenter = new MoviePresenter(getByIdMovieUseCase.execute(new GetByIdMovieUseCase.InputValues(id)).getMovie());
        return ResponseEntity.ok().body(moviePresenter);
    }
}
