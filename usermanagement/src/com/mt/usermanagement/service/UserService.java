package com.mt.usermanagement.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mt.usermanagement.connectionDB.ConnectionDB;
import com.mt.usermanagement.model.Orders;
import com.mt.usermanagement.model.Products;


public class UserService extends ConnectionDB implements UserDao
{

	
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
	public void getproducts(double price) throws SQLException {
		String display="select * from products where price=?;";
		PreparedStatement pm=con.prepareStatement(display);
		pm.setDouble(1, price);
		ResultSet rs=pm.executeQuery();
		rs.next();
	    int pr_id=rs.getInt("p_id");
	    String p_name=rs.getString("name");
	    double p_price=rs.getDouble("price");	
	    System.out.println("product_details"+pr_id+" "+p_name+" "+p_price);
	}

	@Override
	public void searchproduct(String name) throws SQLException {
		String display="select * from products where name=?;";
		PreparedStatement pm=con.prepareStatement(display);
		pm.setString(1, name);
		ResultSet rs=pm.executeQuery();
		rs.next();
	   // int pr_id=rs.getInt("p_id");
	    //String p_name=rs.getString("name");
	    //double p_price=rs.getDouble("price");	
	    //System.out.println("product_details"+pr_id+" "+p_name+" "+p_price);
	    System.out.println("product available");
		
	}

	@Override
	public void orderquantity(Orders order,int qty) throws SQLException {
		String display="select qty from orders where qty=?;";
		PreparedStatement pm=con.prepareStatement(display);
		pm.setInt(1, qty);
		ResultSet rs=pm.executeQuery();
		rs.next();
		int quantity=rs.getInt("qty");
		if(order.getQty()>=quantity)
		{
			System.out.println("stock is available");
		}
		
	}
}
