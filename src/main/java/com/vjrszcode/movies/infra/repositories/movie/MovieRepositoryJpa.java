package com.vjrszcode.movies.infra.repositories.movie;

import com.vjrszcode.movies.core.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepositoryJpa extends JpaRepository<Movie, Long> {
}
