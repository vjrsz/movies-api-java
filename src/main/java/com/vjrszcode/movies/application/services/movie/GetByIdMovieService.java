package com.vjrszcode.movies.application.services.movie;

import com.vjrszcode.movies.adapters.repositories.MovieRepository;
import com.vjrszcode.movies.core.useCases.movie.GetByIdMovieUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetByIdMovieService implements GetByIdMovieUseCase {
    private final MovieRepository repository;

    @Override
    public OutputValues execute(InputValues input) {
        return new OutputValues(repository.findById(input.getId()));
    }
}
