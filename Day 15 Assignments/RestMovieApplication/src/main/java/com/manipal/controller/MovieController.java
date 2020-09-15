package com.manipal.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.exception.MovieNotFoundException;
import com.manipal.model.Movie;
import com.manipal.service.IMovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private IMovieService movieService;

	// @RequestMapping(value ="/addmovie", method=RequestMethod.POST) , OR
	// @PostMapping(value="/addmovie"), OR
	// @PostMapping(value="addmovie"), OR

	@PostMapping
	public String addMovieDetails(@RequestBody Movie movie) {

		System.out.println(movie);
		movieService.addOrUpdateMovie(movie);
		return " Movie Added Successfully";
	}

	// Since we are using POST Method , so someone has to store it .
	// Since ,Data that we are sending is in our Request Body.
	// So What ever RequestBody contains , that will be injected into the movie
	// object.

	@GetMapping("{movieId}")
	public Movie getMovieById(@PathVariable int movieId) {
		
		Movie movie= movieService.getMovieById(movieId);
		if(movie==null)
		throw new MovieNotFoundException("Movie ID is invalid , Please enter correct ID");
		return movie;
			
	}

	@PutMapping
	// for update
	public ResponseEntity<Movie> updateMovie(@RequestBody Movie movieDetails) {
		Movie movie = movieService.getMovieById(movieDetails.getMovieId());
		if (movie != null) {
			movie.setTitle(movieDetails.getTitle());
			movieService.addOrUpdateMovie(movie);
		}
		ResponseEntity<Movie> responseEntity = new ResponseEntity<>(movie, HttpStatus.OK);
		return responseEntity;
	}

	/*or , instead of PUT , we can do this. 
	 * 	@PostMapping("update")
	public ResponseEntity<Movie> updateMovie(@RequestBody Movie movieDetails) {
		Movie movie = movieService.getMovieById(movieDetails.getMovieId());
		if (movie != null) {
			movie.setTitle(movieDetails.getTitle());
			movie.setBudget(movieDetails.getBudget());
			movieService.addOrUpdateMovie(movie);
		} else {
			movieService.addOrUpdateMovie(movieDetails);
		}
		ResponseEntity<Movie> responseEntity = new ResponseEntity<>(movie, HttpStatus.OK);
		return responseEntity;
	}*/

}
