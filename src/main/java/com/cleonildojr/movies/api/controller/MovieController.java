package com.cleonildojr.movies.api.controller;

import com.cleonildojr.movies.model.Movie;
import com.cleonildojr.movies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService service;

    @GetMapping
    public ResponseEntity<List<Movie>> findAllMovies() {
        return new ResponseEntity<>(service.getAllMovies(), HttpStatus.OK);
    }
}
