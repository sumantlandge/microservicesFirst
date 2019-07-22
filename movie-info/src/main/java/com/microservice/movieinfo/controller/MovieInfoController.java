package com.microservice.movieinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.movieinfo.models.Movie;
import com.microservice.movieinfo.models.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@GetMapping("/info")
	String getMovieInfo()
	{
		return new String("good Movie");
	}
	
	@Autowired
	RestTemplate restTemplet;
	
	@RequestMapping("/{userId}")
	public Movie getMovieInfo(@PathVariable("userId") String movieId)
	//public void getMovieInfo(@PathVariable("userId") String mocieId)
	{
		MovieSummary movieSummary =restTemplet.getForObject("https://api.themoviedb.org/3/movie/550?api_key=26bdab9173aa5ff23735c438b35e45e3", MovieSummary.class); 
				//restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +  apiKey, MovieSummary.class);
		
		System.out.println(movieSummary);
		return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
	}
}
