package com.vjrszcode.movies.application.services.movie;

import com.vjrszcode.movies.core.useCases.movie.GetAllMovieUseCase;
import com.vjrszcode.movies.adapters.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetAllMovieService implements GetAllMovieUseCase {
    private final MovieRepository repository;

    @Override
    public OutputValues execute(InputValues input) {
        return new OutputValues(repository.getAll());
    }
}
