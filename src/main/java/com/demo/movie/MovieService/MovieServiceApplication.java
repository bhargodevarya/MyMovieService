package com.demo.movie.MovieService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.getenv().entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
	}
}
