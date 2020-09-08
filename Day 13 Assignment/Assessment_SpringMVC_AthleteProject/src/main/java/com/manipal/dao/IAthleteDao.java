package com.manipal.dao;

import java.util.List;

import com.manipal.model.Athlete;

public interface IAthleteDao {
	public int save(Athlete ath);
	public List<Athlete> getAllAthletes();
}
