package com.vjrszcode.movies.infra.repositories.userMovie.user;

import com.vjrszcode.movies.core.entities.UserMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMovieRepositoryJpa extends JpaRepository<UserMovie, Long> {
}
