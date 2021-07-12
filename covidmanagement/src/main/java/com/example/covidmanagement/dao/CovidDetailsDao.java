package com.example.covidmanagement.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.covidmanagement.exception.CovidDetailsDaoException;
import com.example.covidmanagement.model.CovidDetails;

public interface CovidDetailsDao {

	public ArrayList<CovidDetails> getdetailsofcity(String city) throws CovidDetailsDaoException;
	public int[] insertdata(List<CovidDetails> adddetails) throws CovidDetailsDaoException;
	public ArrayList<CovidDetails> getdetailsofstate(String state) throws CovidDetailsDaoException;
	public int deletedetails(int id) throws CovidDetailsDaoException;
	public int updatedetails(int id,String city) throws CovidDetailsDaoException;
	public  ArrayList<CovidDetails> callablestatement() throws CovidDetailsDaoException;
	public void insertcallablestatement(CovidDetails covid) throws CovidDetailsDaoException;
}
