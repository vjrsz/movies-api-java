package com.vjrszcode.movies.application.services;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.entities.useCases.movies.MovieUseCase;
import com.vjrszcode.movies.infra.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieService implements MovieUseCase {

    private final MovieRepository repository;

    @Override
    public List<Movie> getAll(){
        return repository.findAll();
    }

    @Override
    public Movie findById(Long id) {
        Optional<Movie> obj = repository.findById(id);
        return obj.get();
    }
}
