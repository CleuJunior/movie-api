package com.cleonildojr.movies.service;

import com.cleonildojr.movies.model.Movie;
import com.cleonildojr.movies.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    public List<Movie> getAllMovies() { return repository.findAll(); }
}
