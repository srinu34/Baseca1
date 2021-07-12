package client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import model.City;
import model.SortByPopulation;
import service.ServiceCity;

public class MainMenu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<String, Set<City>> map = new TreeMap<String, Set<City>>();
		Set<City> city = new TreeSet<City>(new SortByPopulation());
		int ch;
		do {
			System.out.println(" City Population");
			System.out.println("\n\t1.Create\n\t2.Display\n\t3.Edit\n\t4.Exit");
			System.out.println("Enter your Choice:");
			ch = scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the number of States:");
				int n = scanner.nextInt();
				map = ServiceCity.addCity(map, n);
				break;
			case 2:
				for (String key : map.keySet())
					System.out.println(key);
				System.out.println("Enter the State name");
				scanner.nextLine();
				String state = scanner.nextLine();
				ServiceCity.display(map, state);
				break;
			case 3:
				System.out.println("Sorry we cannot do this feature.Please Wait for update ");
				int choice;
				do {
					System.out.println("\n\t1.Add City\n\t2.Edit City Population\n\t3.delete City\n\t4.Exit");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						for (String key : map.keySet())
							System.out.println(key);
						System.out.println("Enter the State name");
						scanner.nextLine();
						String stateadd = scanner.nextLine();
						map=ServiceCity.addCity(map,stateadd);
						ServiceCity.display(map, stateadd);
						
						break;
					case 2:
						for (String key : map.keySet())
							System.out.println(key);
						System.out.println("Enter the State name");
						scanner.nextLine();
						String stateedit = scanner.nextLine();
						map=ServiceCity.update(map,stateedit);
						ServiceCity.display(map, stateedit);
					    break;
					case 3:
						for (String key: map.keySet())
							System.out.println(key);
						System.out.println("Enter the State name");
						scanner.nextLine();
						String statedelete = scanner.nextLine();
						//
						map=ServiceCity.delete(map,statedelete);
						ServiceCity.display(map, statedelete);
						break;
						
					case 4:
						break;
					default:
						System.out.println("Enter the vaild Input");
						break;

					}

				} while (choice != 4);
				break;
			case 4:
				break;
			default:
				System.out.println("Enter the correct value>>>>>");
				break;
			}

		} while (ch != 4);

		// TODO Auto-generated method stub

	}
	
	

}

