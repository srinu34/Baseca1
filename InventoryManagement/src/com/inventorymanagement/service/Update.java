package com.inventorymanagement.service;


import java.util.Scanner;

import com.inventorymanagement.model.Inventory;
public class Update 
{
   static Scanner sc=new Scanner(System.in);
	public static void updateQuantitydetails(Inventory[] inventory) 
	{
		System.out.println("Enter the product name:");
		String name=sc.next();
	    System.out.println(" Enter the new Quantity:");
	    int newquantity=sc.nextInt();
	    for (int i = 0; i < inventory.length; i++)
	    {
	    	if(inventory[i].getName().equals(name))
	    	{
	    		inventory[i].setQuantity(newquantity);
	    		System.out.println("=====Quantity updated successfully====");
	    	}
		}
	}

}
