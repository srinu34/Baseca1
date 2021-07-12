package com.example.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.example.model.City;
import com.example.model.State;
import com.example.service.Adddetails;
import com.example.service.Display;
import com.example.service.StateDisplay;




public class Userinput {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		
		Map<String,Set<State>>  map=new TreeMap<>();
		Set<State> state=new TreeSet<>();
		boolean flag=true;
		do
		{
			System.out.println("1.Adddetails:");
			System.out.println("2.Displaydetails:");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				map=Adddetails.addcity(map);
				break;
			case 2:
			    for(String key:map.keySet())
				System.out.println(key);
			    Display.display(map);
////			System.out.println("Enter the state name to display the values:");
////			String name=sc.next();
//			    System.out.println("Enter the country name to display records:");
//				String name=sc.next();
//				for(State state1:map.get(name))
//				{
//					System.out.println(state1.toString());
//				}
//				System.out.println("=========================================");
//				System.out.println();
				break;
			case 3:
				StateDisplay.display(map);
				break;
			
				default:
					System.out.println("Enter valid choice:");
					break;
			}
		}
		while(flag);
	}
}
