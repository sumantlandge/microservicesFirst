package com.microservice.movieinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoApplication.class, args);
	}
	
	@Bean
	//@LoadBalanced //load balancer is going to look for specific url on the discovery server
	RestTemplate getRestTemplet()
	{
		return new RestTemplate();
	}

}
