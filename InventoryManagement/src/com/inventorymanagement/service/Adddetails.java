package com.inventorymanagement.service;


import java.util.Scanner;

import com.inventorymanagement.model.Inventory;

public class Adddetails 
{
  static Scanner sc=new Scanner(System.in);
  public static Inventory[] addproductdetails(Inventory[] inventory)
  {
	  System.out.println("Enter how details do you want to enter:");
	  int nodetails=sc.nextInt();
	  Inventory[] alldetails=new Inventory[nodetails];
	  for (int i = 0; i < alldetails.length; i++) 
	  { 
		System.out.println("==========================================");
		System.out.println("Enter the id:"); 
		int id=sc.nextInt();
		System.out.println("Enter the name of product:");
	    String name=sc.next();
	    System.out.println("Enter the no of Products:");
	    int quantity=sc.nextInt();
	    System.out.println("Enter the price of each Product:");
	    double priceperunit=sc.nextDouble();
	    alldetails[i]=new Inventory(id,name,quantity,priceperunit);
	    System.out.println("=========================================");
	  }
	 return alldetails;  
  }

}
