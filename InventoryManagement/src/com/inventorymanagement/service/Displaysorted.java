package com.inventorymanagement.service;

import com.inventorymanagement.model.Inventory;

public class Displaysorted 
{


	public static void displaysorteddetails(Inventory[] sorted) {
		for (int i = 0; i < sorted.length; i++) 
		{
			System.out.println("========================");
			System.out.println("id      :"+sorted[i].getId());
			System.out.println("product name :"+sorted[i].getName());
			System.out.println("Quantity:"+sorted[i].getQuantity());
			System.out.println("priceperQuantity"+sorted[i].getPriceperunit());
			System.out.println("========================");
			
		}
		
	}

}
