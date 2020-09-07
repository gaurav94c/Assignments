package com.manipal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.manipal.model.Athlete;

public class AthleteDao {
	
	JdbcTemplate jdbctemplate;

	public void setTemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int save(Athlete p) {
		
		String sql = "insert into athlete(name,gender,email,mobile) values('" + p.getName() + "','" + p.getGender() + "','"
				+ p.getEmail() +"','"+p.getMobile()+"')";
		return jdbctemplate.update(sql);
		
	}

	public int update(Athlete p) {

	String sql = "update athlete set name='" + p.getName() + "', gender=" + p.getGender() + ",email='"
				+ p.getEmail()+ ","+ ",mobile='"+p.getMobile();
		return jdbctemplate.update(sql);
	}

	
	public List<Athlete> getAthletes() {
		return jdbctemplate.query("select * from athlete", new RowMapper<Athlete>() {
			public Athlete mapRow(ResultSet rs, int row) throws SQLException {
				Athlete e = new Athlete();
				//e.setId(rs.getInt(1));gives error
				e.setName(rs.getString(2));
				e.setGender(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setMobile(rs.getString(5));
				return e;
			}
		});
	}
}