package com.seven.ratingdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seven.ratingdataservice.model.Rating;
import com.seven.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
	}
	
	@GetMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable String userId) {
	List<Rating> ratings =  Arrays.asList(
			new Rating("2", 4),
			new Rating("3", 5)
		);
	UserRating userRating = new UserRating();
	userRating.setRatings(ratings);
	return userRating;
	}
	
}
