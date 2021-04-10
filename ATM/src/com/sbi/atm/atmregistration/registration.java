package com.sbi.atm.atmregistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.sbi.atm.dao.Atmregistration;
import com.sbi.atm.trancation.Atm;

public class registration implements Atmregistration 
{
	static Scanner sc=new Scanner(System.in);

	private String URL="jdbc:mysql://localhost:3306/scott";
	private String USERNAME="root";
	private String PASSWORD="Root123";
	private Connection con;

	@Override
	public void createconnection() 
	{
		//Register The Driver Manager and get DB Connection.
		try
		{
			con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connection successfull");	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void closeconnection()
	{
		// close the connection
		try
		{
			con.close();
			System.out.println("connection closed");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void withdraw(Atm a,int id) throws SQLException
	{
		String withdraw="select bal from account where id=? ;";
		PreparedStatement pm=con.prepareStatement(withdraw);
		pm.setInt(1,id);
		ResultSet rs=pm.executeQuery();
		rs.next();
		double bal=rs.getDouble("bal");
		if(a.getAmount()<=bal)
		{
			bal=bal-a.getAmount();
			bal=setAmount(bal,id);
			
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
	private double setAmount(double balance, int id) throws SQLException
	{
		//Prepare The Statement(insertQUery)
		//Execute Query
		//process the result.
		String updatebalance="update account set bal=? where id=? ;";
		PreparedStatement pm=con.prepareStatement(updatebalance);
		pm.setDouble(1,balance);
		pm.setInt(2, id);
		pm.executeUpdate();
		return balance;
	}

	@Override
	public void deposit(Atm a,int id) throws SQLException 
	{
		System.out.println("==============================");
		String deposit="select bal from account where id=?;";
		PreparedStatement pm=con.prepareStatement(deposit);
		pm.setInt(1, id);
		ResultSet rs=pm.executeQuery();
		rs.next();//move cursor to first object
		double bal=rs.getDouble("bal");
		
		if(a.getAmount()>0)
		{
			bal=bal+a.getAmount();
			bal=setAmount(bal,id);
			System.out.println("Your Money Successfully Deposit:");
		}
		else
		{
			System.out.println("Enter valid amount:");
		}
		System.out.println("================================");
		System.out.println();
	}

	@Override
	public void showbalance(int id) throws SQLException
	{
		System.out.println("==============================");
		String balance="select bal from account where id=?;";
		PreparedStatement pm=con.prepareStatement(balance);
		pm.setInt(1,id);
		ResultSet rs=pm.executeQuery();
		rs.next();
		double bal=rs.getDouble("bal");
		System.out.println("current balance:"+bal);
		System.out.println("=============================");
		System.out.println();
	}

	@Override
	public void showdetails(int id) throws SQLException 
	{
		System.out.println("================================");
		String details="select * from account where id=?;";
		PreparedStatement pm=con.prepareStatement(details);
		pm.setInt(1, id);
		ResultSet rs=pm.executeQuery();
		rs.next();
		int bankid=rs.getInt("id");
		String name=rs.getString("username");
		double balance=rs.getDouble("bal");
		String branchname=rs.getString("branch");
		String bank=rs.getString("bankname");
		System.out.println("current Details:"+bankid+" "+name+" "+balance+" "+branchname+" "+bank);
		System.out.println("===================================");
		System.out.println();
	}

}
