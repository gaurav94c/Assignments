package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Movie;
import com.manipal.repository.IMovieRepository;
import com.manipal.service.utility.MovieValidationCheck;

@Service
public class MovieService implements IMovieService {


	@Autowired
	private IMovieRepository repository;
	
	public void updateMovie(Movie movie) {
		repository.save(movie);
	}
	
	@Override
	public void addOrUpdateMovie(Movie movie) {
		
		repository.save(movie);
	
		
	}


	@Override
	public Movie getMovieById(int movieId) {
		
		return repository.findById(movieId).orElse(null);
	}

}
