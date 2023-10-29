package com.vjrszcode.movies.core.useCases.movie;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.useCases.UseCase;
import lombok.Value;

public interface GetByIdMovieUseCase extends UseCase<GetByIdMovieUseCase.InputValues, GetByIdMovieUseCase.OutputValues> {

    @Value
    class InputValues implements UseCase.InputUseCase {
        Long id;
    }

    @Value
    class OutputValues implements UseCase.OutputUseCase {
        Movie movie;
    }
}
