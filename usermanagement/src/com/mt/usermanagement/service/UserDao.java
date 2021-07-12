package com.mt.usermanagement.service;

import java.sql.SQLException;

import com.mt.usermanagement.model.Orders;
import com.mt.usermanagement.model.Products;

public interface UserDao {
	public void getproducts(double price) throws SQLException;
	public void searchproduct(String name) throws SQLException;
	public void orderquantity(Orders order,int qty) throws SQLException;
}
