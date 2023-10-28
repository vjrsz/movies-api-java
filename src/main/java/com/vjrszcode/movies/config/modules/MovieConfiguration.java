package com.vjrszcode.movies.config.modules;

import com.vjrszcode.movies.application.services.movie.GetAllMovieService;
import com.vjrszcode.movies.core.useCases.movies.GetAllMovieUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfiguration {
    @Bean
    public GetAllMovieUseCase getAllMovieUseCase(GetAllMovieService getAllMovieService){
        return getAllMovieService;
    }

}
