package com.vjrszcode.movies.core.useCases.movies;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.useCases.UseCase;
import lombok.Value;

import java.util.List;

public interface GetAllMovieUseCase extends UseCase<GetAllMovieUseCase.InputValues, GetAllMovieUseCase.OutputValues>{
    @Value
    class InputValues implements UseCase.InputUseCase { }

    @Value
    class OutputValues implements UseCase.OutputUseCase {
        List<Movie> movies;
    }

}
