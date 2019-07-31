package com.seven.moviecatalogservice.resources;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.seven.moviecatalogservice.service.MovieInfo;
import com.seven.moviecatalogservice.service.UserRatingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.seven.moviecatalogservice.model.CatalogItem;
import com.seven.moviecatalogservice.model.Movie;
import com.seven.moviecatalogservice.model.Rating;
import com.seven.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MoviCatalogResource {



	@Autowired
	MovieInfo movieInfo;

	@Autowired
	UserRatingInfo userRatingInfo;

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		UserRating userRating = userRatingInfo.getUserRating(userId);
		return userRating.getRatings().stream()
				.map(rating -> movieInfo.getCatalogItem(rating))
				.collect(Collectors.toList());
	}

}
