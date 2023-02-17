package com.cleonildojr.movies.repository;

import com.cleonildojr.movies.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, Object>{ }
