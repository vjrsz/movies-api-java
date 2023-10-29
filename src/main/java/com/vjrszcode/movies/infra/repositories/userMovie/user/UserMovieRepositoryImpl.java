package com.vjrszcode.movies.infra.repositories.userMovie.user;

import com.vjrszcode.movies.adapters.repositories.UserMovieRepository;
import com.vjrszcode.movies.core.entities.UserMovie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserMovieRepositoryImpl implements UserMovieRepository {

    private final UserMovieRepositoryJpa repository;

    @Override
    public List<UserMovie> getAll() {
        return repository.findAll();
    }

    @Override
    public List<UserMovie> saveAll(List<UserMovie> userMovies) {
        return repository.saveAll(userMovies);
    }

    @Override
    public UserMovie findById(Long id) {
        return repository.findById(id).get();
    }
}
