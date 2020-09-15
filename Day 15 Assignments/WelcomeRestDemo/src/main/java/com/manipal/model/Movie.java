package com.manipal.model;

import java.time.LocalDate;

public class Movie {

	private int movieId;
	private String title;
	private String leadRole;
	private double budget;
	private LocalDate releaseDate;

	public Movie(int movieId, String title, String leadRole, double budget) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.leadRole = leadRole;
		this.budget = budget;
	}

	
	public Movie() {
		super();
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLeadRole() {
		return leadRole;
	}

	public void setLeadRole(String leadRole) {
		this.leadRole = leadRole;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


}
