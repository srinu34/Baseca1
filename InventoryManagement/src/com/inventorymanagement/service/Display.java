package com.inventorymanagement.service;

import com.inventorymanagement.model.Inventory;

public class Display 
{

	public static void displayalldetails(Inventory[] inventory)
	{
		for (int i = 0; i < inventory.length; i++) 
		{
			System.out.println("*********************************");
			System.out.println("id           : "+inventory[i].getId());
			System.out.println("product name :"+inventory[i].getId());
			System.out.println("Quantity     :"+inventory[i].getQuantity());
			System.out.println("priceperunit :"+inventory[i].getPriceperunit());
			System.out.println("*********************************");
		}
		
		
	}

}
