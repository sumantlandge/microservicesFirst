package com.microservice.movierating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.movierating.models.Rating;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {

	@Autowired
	private RestTemplate restTemplet;

	@GetMapping("/{movieId}")
	Rating getMovieRating(@PathVariable("movieId") String movieId) {
		return restTemplet.getForObject(
				"https://api.themoviedb.org/3/movie/" + movieId + "?api_key=26bdab9173aa5ff23735c438b35e45e3",
				Rating.class);
	}
}
