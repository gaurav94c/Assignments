package com.manipal.dao;

public class UserDao {

	public boolean verifyUser(String studentName,String studentPassword) {
		//my logic here
		//database and check it
		//check it with hard coded values
		if ((studentName =="admin") && (studentPassword=="admin123"))
		{
			return true;
		}
		else
			return false;
	}

}
