package service;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model.City;
import model.SortByPopulation;

public class ServiceCity {
	
	public static Map<String,Set<City>> addCity(Map<String,Set<City>>  map,int n)
	{
		for (int i=0;i<n;i++)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter name of the State:");
			String state=scanner.nextLine();
			System.out.println("Enter number of the City:");
			int number=scanner.nextInt();
			Set<City> set=new TreeSet<City>(new SortByPopulation());
			for(int j=0;j<number;j++)
			{
				
				System.out.println("Enter name of the City:");
				scanner.nextLine();
				String city=scanner.nextLine();
				System.out.println("Enter Population amount:");
				int population=scanner.nextInt();
				City cityclass=new City(j,city,population);
				set.add(cityclass);
				
			}
			
			map.put(state,set);
		}
		
		return map;
	}

	public static void display(Map<String, Set<City>> map, String state) {
		// TODO Auto-generated method stub
		for (City city:map.get(state))
		{
			System.out.println(city.toString());
		}
		
	}
	
	public static Map<String, Set<City>> addCity(Map<String, Set<City>> map, String stateadd) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of the City:");
		int number = scanner.nextInt();
		int len = map.get(stateadd).size();
		// Set<City> set=new HashSet<City>();
		for (int j = len; j < number + len; j++) {

			System.out.println("Enter name of the City:");
			scanner.nextLine();
			String city = scanner.nextLine();
			System.out.println("Enter Population amount:");
			int population = scanner.nextInt();
			City cityclass = new City(j, city, population);
			map.get(stateadd).add(cityclass);
		}

		return map;
	}

	public static   Map<String, Set<City>> update(Map<String, Set<City>> map, String stateedit) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for (City city : map.get(stateedit)) {
			System.out.println(city.toString());
		}
		System.out.println("enter the city id");
		int id = scanner.nextInt();
		System.out.println("enter the total Population amount");
		int population = scanner.nextInt();
		for (City city : map.get(stateedit)) {
			if (city.getId() == id) {
				city.setPopulation(population);
				break;
			}
		}
		
		return map;
	}

	public static Map<String, Set<City>> delete(Map<String, Set<City>> map, String statedelete) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for (City city : map.get(statedelete)) {
			System.out.println(city.toString());
		}
		System.out.println("enter the city id");
		int id = scanner.nextInt();

		Iterator<City> it = map.get(statedelete).iterator();

		while (it.hasNext()) {
			if (it.next().getId() == id) { // remove even elements
				it.remove();
			}
		}

		return map;
	}

}
