package com.microservice.movierating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingApplication.class, args);
	}

	@Bean
	RestTemplate getRestTemplet()
	{
		return new RestTemplate();
	}

}
