package com.vjrszcode.movies.infra.repositories.movie;

import com.vjrszcode.movies.adapters.repositories.MovieRepository;
import com.vjrszcode.movies.core.entities.Movie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MovieRepositoryImpl implements MovieRepository {

    private final MovieRepositoryJpa repository;

    @Override
    public List<Movie> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Movie> saveAll(List<Movie> movies) {
        return repository.saveAll(movies);
    }

    @Override
    public Movie findById(Long id) {
        return repository.findById(id).get();
    }
}
