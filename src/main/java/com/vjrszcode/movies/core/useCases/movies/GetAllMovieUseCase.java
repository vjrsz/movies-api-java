package com.vjrszcode.movies.core.useCases.movies;

import com.vjrszcode.movies.adapters.gateways.MovieGateway;
import com.vjrszcode.movies.adapters.presenters.MoviesPresenter;
import com.vjrszcode.movies.core.useCases.UseCase;

public interface GetAllMovieUseCase extends UseCase<MovieGateway, MoviesPresenter>{

}
