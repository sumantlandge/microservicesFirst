package com.microservice.movierating.models;

public class Rating {
	private String id;
    private String vote_average;

//    public Rating(String movieId, String rating) {
//        this.movieId = movieId;
//        this.vote_average = rating;
//    }



	public String getVote_average() {
		return vote_average;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}

    
}
