package com.vjrszcode.movies.adapters.presenters;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.useCases.UseCase;
import lombok.Builder;

import java.util.List;

public class MoviesPresenter implements UseCase.OutputUseCase {

    private final List<MoviePresenter> movies;

    public MoviesPresenter(List<MoviePresenter> movies){
        this.movies = movies;
    }

}
