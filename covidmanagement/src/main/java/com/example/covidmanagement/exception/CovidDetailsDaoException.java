package com.example.covidmanagement.exception;

public class CovidDetailsDaoException  extends Exception{
	

	public CovidDetailsDaoException()
	{
		System.out.println("SQL EXCEPTION:");
	}
	public CovidDetailsDaoException(String message)
	{
		super(message);
	}

}
