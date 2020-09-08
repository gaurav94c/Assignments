package com.manipal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.manipal.dao.helper.AthleteResultSetExtractor;
import com.manipal.model.Athlete;

public class AthleteDao implements IAthleteDao {
	
	
	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getJdbcTemplate() {
		return template;
	}

	public void setJdbcTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Athlete athlete) {

		String query = "insert into ATHLETETABLE(name,gender,email,mobile) values('" + athlete.getName() + "','"
				+ athlete.getGender() + "','" + athlete.getEmail() + "','" + athlete.getMobile() + "')";
		
		
		int status = template.update(query);
		return status;
	}


	public List<Athlete> getAllAthletes() {
		String sql = "SELECT * FROM ATHLETETABLE";
		List<Athlete> athleteList = template.query(sql, new AthleteResultSetExtractor());
		return athleteList;
	}

}