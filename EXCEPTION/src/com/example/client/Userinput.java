package com.example.client;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.example.exception.InvalidNumberException;
import com.example.model.City;
import com.example.model.State;
import com.example.service.Adddetails;
import com.example.service.Display;
import com.example.service.StateDisplay;





public class Userinput {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws InvalidNumberException
	{
		
		Map<String,Set<State>>  map=new TreeMap<>();
		Set<State> state=new TreeSet<>();
		boolean flag=true;
		
		do
		{
			System.out.println("1.Adddetails:");
			System.out.println("2.Displaydetails:");
			System.out.println("3.State Details:");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			
			case 1:
				try
				{
				map=Adddetails.addcity(map);
				}
				catch(InvalidNumberException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try
				{
			    
			    Display.display(map);
				}
				catch(InvalidNumberException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try
				{
					StateDisplay.display(map);
				}
				catch(InvalidNumberException e)
				{
					System.out.println(e.getMessage());
				}
				break;

				default:
				System.out.println("Enter valid choice:");
	        	break;
			
			}

		}
		while(flag);
		
	}
}