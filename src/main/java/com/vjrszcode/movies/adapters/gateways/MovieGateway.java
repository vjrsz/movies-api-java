package com.vjrszcode.movies.adapters.gateways;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.entities.enums.MovieStatus;
import com.vjrszcode.movies.core.useCases.UseCase;

public class MovieGateway implements UseCase.InputUseCase {

    private final Long id;
    private final String name;
    private final String description;
    private final Integer status;

    public MovieGateway(Long id, String name, String description, Integer status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public Movie getMovie(){
        return new Movie(id, name, description, MovieStatus.valueOf(status));
    }
}
