package com.vjrszcode.movies.application.services.movie;

import com.vjrszcode.movies.adapters.gateways.MovieGateway;
import com.vjrszcode.movies.adapters.presenters.MoviesPresenter;
import com.vjrszcode.movies.core.useCases.movies.GetAllMovieUseCase;
import com.vjrszcode.movies.adapters.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetAllMovieService implements GetAllMovieUseCase {
    private final MovieRepository repository;

    @Autowired
    public GetAllMovieService(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public MoviesPresenter execute(MovieGateway input) {
        return MoviesPresenter.fromListMovies(repository.findAll());
    }
}
