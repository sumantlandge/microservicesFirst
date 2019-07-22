package com.microservice.moviecatalog.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.moviecatalog.models.Movie;

@RestController
public class MovieController {
	
	@GetMapping("/")
	public String getStatus()
	{
		return "movie catalog is running radishinig";
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	Map<String, String> movieInfo = new HashMap<>();
	@GetMapping("/getmovie")
	Map<String, String> getMovieCatalog(){
		String movieInfoReceived = "timepass movie";
		
		//movieInfoReceived = restTemplate.getForObject("localhost:8082/movies/info", String.class);
		movieInfoReceived = restTemplate.getForObject("http://movie-info-service/movies/info", String.class);
		//Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
		
		//movieInfo.put(movieInfoReceived, "8");
		System.out.println("movie info received:::::::::::::::::::::::: "+movieInfoReceived);
		movieInfo.put(movieInfoReceived, "6");
		return movieInfo;
	}
}
