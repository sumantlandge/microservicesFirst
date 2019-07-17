package com.microservice.movieinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@GetMapping("/info")
	String getMovieInfo()
	{
		return new String("good Movie");
	}
}
