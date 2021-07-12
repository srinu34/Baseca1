package com.example.covidmanagement.connectionDB;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class ConnectionDB {

	protected static String URL="jdbc:mysql://localhost:3306/test";
	protected static  String USERNAME="root";
	protected static String PASSWORD="12345";
	protected static Connection con;
	public abstract void createconnection();
	public abstract void closeconnection();
		
	
}
