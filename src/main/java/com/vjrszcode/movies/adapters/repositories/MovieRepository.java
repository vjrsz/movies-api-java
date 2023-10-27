package com.vjrszcode.movies.adapters.repositories;


import com.vjrszcode.movies.core.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
}
