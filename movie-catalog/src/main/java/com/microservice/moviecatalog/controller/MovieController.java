package com.microservice.moviecatalog.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	Map<String, Integer> movieInfo = new HashMap<>();
	@GetMapping("/getmovie")
	Map<String, Integer> getMovieCatalog(){
		movieInfo.put("Intersteller", 9);
		movieInfo.put("inception", 8);
		movieInfo.put("Terminator", 6);
		
		return movieInfo;
	}
}
