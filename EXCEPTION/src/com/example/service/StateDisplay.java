package com.example.service;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.example.exception.InvalidNumberException;
import com.example.model.State;

public class StateDisplay {
	static Scanner sc=new Scanner(System.in);
	public static void display(Map<String, Set<State>> map) throws InvalidNumberException
	{
		try
		{
		System.out.println("Enter the country:");
		String countryname=sc.next();
		System.out.println("Enter the state:");
		String statename=sc.next();
		for(String country:map.keySet())
		{
			if(country.equals(countryname))
			{
				for(State state:map.get(country))
				{
					if(state.getName().equals(statename))
					{
						System.out.println(state.toString());
					}
				}
			}
		}

	}
		catch(NullPointerException e)
		{
		   throw new InvalidNumberException();
		}
	}
}
