package com.seven.movieinfoservice.models;

public class Movie {
	private String movieId;
	private String movieName;
	private String overview;
	
	public Movie(String movieId, String movieName, String overview) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.overview = overview;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	
	
	
}
