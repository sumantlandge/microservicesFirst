package com.microservice.movierating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRatingController {

	@GetMapping("/movierating")
	Integer getMovieRating()
	{
		return new Integer(6);
	}
}
