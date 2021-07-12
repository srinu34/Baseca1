package com.furnituremanagement.client;

import java.util.Scanner;

import com.furnituremanagement.model.FurnitureStore;
import com.furnituremanagement.service.Adddetails;
import com.furnituremanagement.service.Display;
import com.furnituremanagement.service.FindMax;


public class UserInput {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		FurnitureStore[] furniture=new FurnitureStore[50];
        boolean flag=true;
		do
		{
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				furniture=Adddetails.addfurniture();
			break;
			case 2:
				Display.display(furniture);
				break;
			case 3:
				FindMax.findmax(furniture);
				break;
			default:
				System.out.println("Enter valid choice:");
			break;
			}
		}
		while(flag);
	}
	
}
