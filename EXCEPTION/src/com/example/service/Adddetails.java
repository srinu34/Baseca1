package com.example.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.example.exception.InvalidNumberException;
import com.example.model.City;
import com.example.model.State;
import com.example.model.Town;

public class Adddetails {

	static Scanner sc = new Scanner(System.in);

	public static Map<String, Set<State>> addcity(Map<String, Set<State>> map) throws InvalidNumberException {
		try {

			System.out.println("Enter no of country:");
			int country = sc.nextInt();
			for (int x = 0; x < country; x++) {
				System.out.println("===========================");
				System.out.println("Enter country name:");
				String countryname = sc.next();
				System.out.println("=============================");
				System.out.println("Enter the number of States:");
				int n = sc.nextInt();
				System.out.println("=========================");
				Set<State> set = new HashSet<>();
				for (int i = 0; i < n; i++) {

					System.out.println("Enter the state name:");
					String statename = sc.next();
					System.out.println("=========================");
					System.out.println("Enter the number of city:");
					int number = sc.nextInt();
					Set<City> set1 = new HashSet<>();
					for (int j = 0; j < number; j++) {
						System.out.println("=========================");
						System.out.println("Enter city name:");
						sc.nextLine();
						String cityname = sc.nextLine();
						System.out.println("Enter the city population:");
						int population = sc.nextInt();
						System.out.println("============================");
						System.out.println("Enter the number of town:");
						int townnumber = sc.nextInt();
						Set<Town> set2 = new TreeSet<>();
						for (int k = 0; k < townnumber; k++) {
							System.out.println("============================");
							System.out.println("Enter town name:");
							String townname = sc.next();
							Town town = new Town(townname);
							set2.add(town);
							System.out.println("============================");
						}
						City city = new City(j, cityname, population, set2);
						set1.add(city);
						System.out.println("============================");
					}
					State state = new State(i, statename, set1);
					set.add(state);
				}
				System.out.println("===========Delails Entered Successfully===========");
				map.put(countryname, set);
			}
			return map;
		} catch (InputMismatchException e) {
			throw new InvalidNumberException();
		}
	}

}
