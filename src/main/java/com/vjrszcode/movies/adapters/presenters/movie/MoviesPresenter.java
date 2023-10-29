package com.vjrszcode.movies.adapters.presenters.movie;

import com.vjrszcode.movies.core.entities.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class MoviesPresenter{

    private final List<MoviePresenter> movies;

    public static MoviesPresenter fromListMovies(List<Movie> movies){
        List<MoviePresenter> listMovies = new ArrayList<>();
        movies.forEach(movie -> { listMovies.add(new MoviePresenter(movie)); });
        return new MoviesPresenter(listMovies);
    }

}
