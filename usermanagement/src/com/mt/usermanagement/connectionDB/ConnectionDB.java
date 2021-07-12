package com.mt.usermanagement.connectionDB;

import java.sql.Connection;

public abstract class ConnectionDB {
	protected static String URL="jdbc:mysql://localhost:3306/scott";
	protected static  String USERNAME="root";
	protected static String PASSWORD="12345";
	protected static Connection con;
	public abstract void createconnection();
	public abstract void closeconnection();

}
