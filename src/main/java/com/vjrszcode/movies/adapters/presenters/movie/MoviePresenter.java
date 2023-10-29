package com.vjrszcode.movies.adapters.presenters.movie;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.entities.User;
import com.vjrszcode.movies.core.useCases.UseCase;

public class MoviePresenter implements UseCase.OutputUseCase {

    private final Movie movie;

    public MoviePresenter(Movie movie){
        this.movie = movie;
    }

    public Long getId(){
        return movie.getId();
    }

    public String getName(){
        return movie.getName();
    }

    public String getDescription(){
        return movie.getDescription();
    }

    public Movie getMovie() {
        return movie;
    }
}
