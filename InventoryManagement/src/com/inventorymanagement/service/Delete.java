package com.inventorymanagement.service;

import java.util.Scanner;

import com.inventorymanagement.model.Inventory;

public class Delete 
{
    static Scanner sc=new Scanner(System.in);
	public static void deteteparticularproduct(Inventory[] inventory)
	{
		System.out.println("Enter the particular product to delete:");
		String deleteproduct=sc.next();
		for (int i = 0; i < inventory.length; i++) 
		{
			if(inventory[i].getName().equals(deleteproduct))
			{
				inventory[i]=null;
				System.out.println("====Deleted Successfully====");
			}	
		}
	}

}
