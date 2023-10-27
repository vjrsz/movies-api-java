package com.vjrszcode.movies.infra.repositories;


import com.vjrszcode.movies.core.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{
}
