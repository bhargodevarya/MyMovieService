package com.demo.movie.MovieService.repo;

import com.demo.movie.MovieService.model.dao.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepo extends MongoRepository<Movie, ObjectId> {
    Movie findByTitle(String name);
}
