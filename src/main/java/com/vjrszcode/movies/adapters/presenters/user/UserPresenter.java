package com.vjrszcode.movies.adapters.presenters.user;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.entities.User;
import com.vjrszcode.movies.core.entities.UserMovie;
import com.vjrszcode.movies.core.useCases.UseCase;

import java.util.Set;

public class UserPresenter implements UseCase.OutputUseCase {

    private final User user;

    public UserPresenter(User user){
        this.user = user;
    }

    public Long getId(){
        return user.getId();
    }

    public String getName(){
        return user.getName();
    }

    public Set<Movie> getMovie(){
        return user.getMovies();
    }
}
