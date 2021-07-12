package com.example.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.example.exception.InvalidNumberException;
import com.example.model.City;
import com.example.model.State;

public class Display {

	static Scanner sc=new Scanner(System.in);
	public static void display(Map<String, Set<State>> map) throws InvalidNumberException
	{ 
		try
		{
		System.out.println("========================================");
		System.out.println("Enter the country name to display records:");
		String name=sc.next();
		for(State state:map.get(name))
		{
			System.out.println(state.toString());
		}
		System.out.println("=========================================");
	}
		catch(NullPointerException e)
		{
			throw new InvalidNumberException();
		}
	}
	

}
