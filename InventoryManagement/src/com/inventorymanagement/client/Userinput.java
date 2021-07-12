package com.inventorymanagement.client;

import java.util.Scanner;

import com.inventorymanagement.model.Inventory;
import com.inventorymanagement.service.Adddetails;
import com.inventorymanagement.service.Delete;
import com.inventorymanagement.service.Display;
import com.inventorymanagement.service.Displaycompared;
import com.inventorymanagement.service.Displaysorted;
import com.inventorymanagement.service.Sortdetails;
import com.inventorymanagement.service.Update;

public class Userinput
{
	//1. Add new product in inventory.
	//2. Update the quantity of particular product.
	//3. Display products where quantity is less than provided by a user.
	//4. Display product sort on the basis of quantity.
	//5. Delete a particular product from inventory.
	//6. Exit
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	Inventory[] inventory=new Inventory[50];
	boolean flag=true;
	do
	{
		System.out.println("Enter the choce:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		//1. Add new product in inventory.
			//>add new prodect details to the inventory.
			inventory=Adddetails.addproductdetails(inventory);
			 Display.displayalldetails(inventory);
	    break;
		case 2:
		//2. Update the quantity of particular product.
			//>update the quantity based on the given product.
			Update.updateQuantitydetails(inventory);
		break;
		case 3:
		//3. Display products where quantity is less than provided by a user.
			//>user given quantity compare to the inventory quantity less than display the products
			Displaycompared.displayproducts(inventory);
		break;
		case 4:
		//4. Display product sort on the basis of quantity.
			//>sort the quantity details and display the details
			Inventory[] sorted=Sortdetails.sortQuantityDetails(inventory);
			Displaysorted.displaysorteddetails(sorted);
		break;
		case 5:
		//5. Delete a particular product from inventory.
			//>enter the particular product to be delete
			Delete.deteteparticularproduct(inventory);
		break;
		case 6:
		//6. Exit
			exit();
			flag=false;
		break;
		default:
			System.out.println("Enter valid choice:");
		break;
				
		}
	  }
	while(flag);
	}
	private static void exit() 
	{
		System.out.println("=======Successfully Exit=======");
		
	}
}
