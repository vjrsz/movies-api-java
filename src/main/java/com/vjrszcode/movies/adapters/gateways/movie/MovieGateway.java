package com.vjrszcode.movies.adapters.gateways.movie;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.entities.enums.MovieStatus;
import com.vjrszcode.movies.core.useCases.UseCase;

public class MovieGateway {

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
        return new Movie();
    }
}
