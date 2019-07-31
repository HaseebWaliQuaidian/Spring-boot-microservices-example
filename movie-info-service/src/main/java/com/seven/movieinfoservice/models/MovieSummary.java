package com.seven.movieinfoservice.models;

public class MovieSummary {
	private String title;
	private String overview;
	
	public MovieSummary() {}
	public MovieSummary(String movieId, String summary, String overview) {
		super();
		this.title = summary;
		this.overview = overview;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String summary) {
		this.title = summary;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	
	
}
