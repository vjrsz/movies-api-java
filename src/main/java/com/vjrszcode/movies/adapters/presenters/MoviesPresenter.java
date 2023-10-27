package com.vjrszcode.movies.adapters.presenters;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.useCases.UseCase;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MoviesPresenter implements UseCase.OutputUseCase {

    private final List<MoviePresenter> movies;

    public MoviesPresenter(List<MoviePresenter> movies){
        this.movies = movies;
    }

    public static MoviesPresenter fromListMovies(List<Movie> movies){
        List<MoviePresenter> listMovies = new ArrayList<>();
        movies.forEach(movie -> { listMovies.add(new MoviePresenter(movie)); });

        return new MoviesPresenter(listMovies);
    }

}
