package com.cleonildojr.movies.service;

import com.cleonildojr.movies.model.Movie;
import com.cleonildojr.movies.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    public List<Movie> getAllMovies() { return repository.findAll(); }

    public Optional<Movie> getMovieByImdbId(final String id) { return repository.findMovieByImdbId(id); }
}
