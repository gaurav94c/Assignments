package com.manipal.service;

import com.manipal.model.Movie;

public interface IMovieService {

	 void  addOrUpdateMovie(Movie movie);
	 Movie getMovieById(int movieId);
}
