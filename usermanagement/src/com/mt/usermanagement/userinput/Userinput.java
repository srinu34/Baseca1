package com.mt.usermanagement.userinput;

import java.sql.SQLException;
import java.util.Scanner;

import com.mt.usermanagement.model.Orders;
import com.mt.usermanagement.service.UserService;


public class Userinput 
{
	//1.create stocks and orders
   //2.display all the mob stocks based on their price and brand
	//3.search for specific stock for inventory if not available then throw a user defined exception
	//4.customer should be able to order a mob stock with some quantity
	//if ordered quantity is greater than quantity stock.raise a user defined exception
	//specify available quantity in stock
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		UserService s1=new UserService();
		s1.createconnection();
		Orders order=new Orders();
		try
		{
			while(true)
			{
				int n=sc.nextInt();
				switch(n)
				{ 
				case 1:
				  System.out.println("enteramount");
				  double amount=sc.nextDouble();
				  s1.getproducts(amount);
				  break;
				case 2:
					System.out.println("enterproductname");
					  String name=sc.next();
					  s1.searchproduct(name);
					break;
				case 3:
					System.out.println("enter the quantity");
					int quantity=sc.nextInt();
					order.setQty(quantity);
					s1.orderquantity(order, quantity);
					
				break;
				
				}
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		s1.closeconnection();
	}
}
