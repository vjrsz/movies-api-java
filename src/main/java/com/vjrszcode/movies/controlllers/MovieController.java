package com.vjrszcode.movies.controlllers;

import com.vjrszcode.movies.application.services.MovieService;
import com.vjrszcode.movies.core.entities.Movie;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
@AllArgsConstructor
public class MovieController {

    private final MovieService service;

    @GetMapping
    public ResponseEntity<List<Movie>> getAll(){
        List<Movie> users = service.getAll();
        return ResponseEntity.ok().body(users);
    }
}
