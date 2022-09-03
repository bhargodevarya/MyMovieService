package com.demo.movie.MovieService.api;

import com.demo.movie.MovieService.model.response.MovieResponse;
import com.demo.movie.MovieService.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieAPI {

    @Autowired
    private MovieService movieService;

    @RequestMapping(method = RequestMethod.GET, path = "hello")
    public String hello() {
        System.out.println(">>> say hello");
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<MovieResponse> allMovies() {
        return movieService.getAllMovies();
    }
}
