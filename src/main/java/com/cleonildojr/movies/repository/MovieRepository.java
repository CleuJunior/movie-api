package com.cleonildojr.movies.repository;

import com.cleonildojr.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> { }
