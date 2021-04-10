package com.sbi.atm.dao;

import java.sql.SQLException;

import com.sbi.atm.trancation.Atm;

public interface Atmregistration
{
	public void createconnection();
	public void closeconnection();
	public void withdraw(Atm a,int id) throws SQLException;
	public void deposit(Atm a,int id) throws SQLException;
	public void showbalance(int id) throws SQLException;
	public void showdetails(int id) throws SQLException;

}
