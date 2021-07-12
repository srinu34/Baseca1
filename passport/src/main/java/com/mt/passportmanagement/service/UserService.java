package com.mt.passportmanagement.service;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.transform.Result;

import com.mt.passportmanagement.Exception.InvalidNumberException;
import com.mt.passportmanagement.connectionDB.ConnectionDB;
import com.mt.passportmanagement.model.PassportDetails;
import com.mt.passportmanagement.model.PersonDetails;

public class UserService extends ConnectionDB implements Dao {

	@Override
	public void createconnection() {
		try
		{
			con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("=====connection successfull===");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void closeconnection() {
		try
		{
			con.close();
			System.out.println("=======connection closed successfull=========");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void getdetailsofpassport(int p_id) throws InvalidNumberException {
		try
		{
		String getquery="select * from passport where p_id=?;";
		PreparedStatement pm = con.prepareStatement(getquery);
			pm.setInt(1, p_id);
			ResultSet rs=pm.executeQuery();
			rs.next();
			int passport_id=rs.getInt("pa_id");
			int person_id=rs.getInt("p_id");
			String issueing_date=rs.getString("issue_date");
			String issueing_place=rs.getString("issue_place");
			System.out.println("Passport Details:"+passport_id+" "+person_id+" "+issueing_date+" "+issueing_place);
		} 
		catch ( SQLException e) {
		
			throw new InvalidNumberException();
		}
		
	}

}
