package com.inventorymanagement.service;


import java.util.Scanner;

import com.inventorymanagement.model.Inventory;

public class Displaycompared 
{
    static Scanner sc=new Scanner(System.in);
	
	public static void displayproducts(Inventory[] inventory) 
	{
		System.out.println("Enter the Quantity:");
		int Quantity=sc.nextInt();
		for (int i = 0; i < inventory.length; i++) 
		{
			if(inventory[i].getQuantity()<Quantity)
			{
				System.out.println("========================");
				System.out.println("id      :"+inventory[i].getId());
				System.out.println("product name :"+inventory[i].getName());
				System.out.println("Quantity:"+inventory[i].getQuantity());
				System.out.println("priceperQuantity"+inventory[i].getPriceperunit());
				System.out.println("========================");
			}
		
	}
	}
}

