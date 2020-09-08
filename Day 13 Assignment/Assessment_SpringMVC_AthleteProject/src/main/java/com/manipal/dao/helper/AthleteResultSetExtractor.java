package com.manipal.dao.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manipal.model.Athlete;

public class AthleteResultSetExtractor implements ResultSetExtractor<List<Athlete>> {

		public List<Athlete> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Athlete> athleteList = new ArrayList<Athlete>();

			while (rs.next()) {
				Athlete ath = new Athlete();
				Random rand = new Random();
				ath.setId((int) rand.nextInt(800) + 1000);
				ath.setName(rs.getString(2));
				ath.setGender(rs.getString(3));
				ath.setEmail(rs.getString(4));
				ath.setMobile(rs.getString(5));
				athleteList.add(ath);

			}

			return athleteList;
		}

	}


