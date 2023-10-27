package com.vjrszcode.movies.config.seeders;

import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.entities.enums.MovieStatus;
import com.vjrszcode.movies.infra.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("test")
@AllArgsConstructor
public class MovieSeeder implements CommandLineRunner {

    private final MovieRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Movie m1 = new Movie(null, "Filme 1", "filme top", MovieStatus.PENDING);
        Movie m2= new Movie(null, "Filme 2", "filme top",  MovieStatus.WATCHED);
        Movie m3 = new Movie(null, "Filme 3", "filme top",  MovieStatus.PENDING);

        repository.saveAll(List.of(m1, m2, m3));
    }
}
