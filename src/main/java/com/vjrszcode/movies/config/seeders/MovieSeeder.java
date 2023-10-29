package com.vjrszcode.movies.config.seeders;

import com.vjrszcode.movies.adapters.repositories.UserRepository;
import com.vjrszcode.movies.core.entities.Movie;
import com.vjrszcode.movies.core.entities.User;
import com.vjrszcode.movies.core.entities.enums.MovieStatus;
import com.vjrszcode.movies.adapters.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("test")
@AllArgsConstructor
public class MovieSeeder implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "User 1");
        User u2 = new User(null, "User 2");
        userRepository.saveAll(List.of(u1, u2));

        Movie m1 = new Movie(null, "Filme 1", "filme top", MovieStatus.PENDING, u1);
        Movie m2= new Movie(null, "Filme 2", "filme top",  MovieStatus.WATCHED);
        Movie m3 = new Movie(null, "Filme 3", "filme top",  MovieStatus.PENDING);

        movieRepository.saveAll(List.of(m1, m2, m3));
    }
}
