package com.example.covidmanagement.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.covidmanagement.dao.CovidDetailsDaoImpl;
import com.example.covidmanagement.exception.CovidDetailsDaoException;
import com.example.covidmanagement.model.CovidDetails;

public class Userinput {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CovidDetailsDaoImpl service = new CovidDetailsDaoImpl();
		service.createconnection();
		List<CovidDetails> adddetails = new ArrayList<>();
		adddetails.add(new CovidDetails(8, 30, 200, "tpt", "ap", 50, "27-09-2020"));
		adddetails.add(new CovidDetails(9, 30, 200, "tpt", "ap", 50, "27-09-2020"));
		adddetails.add(new CovidDetails(10, 30, 200, "tpt", "ap", 50, "27-09-2020"));
		try {
			while (true) {
				System.out.println("1.Get the details by city:");
				System.out.println("2.Insert the details:");
				System.out.println("3.Delete the particular record:");
				System.out.println("4.Get the details from state:");
				System.out.println("5.Update the details:");
				System.out.println("6.call the Callable Statement to get values:");
				System.out.println("7.insert data using callable statement:");
				int n = sc.nextInt();
				switch (n) {
				case 1:
					System.out.println("Enter city name:");
					String name = sc.next();
					ArrayList<CovidDetails> citylist = service.getdetailsofcity(name);
					if (citylist == null) {
						System.out.println("NO Data:");
					} else {
						citylist.forEach(p -> System.out.println(p));
					}
					break;
				case 2:
					int a[] = service.insertdata(adddetails);
					for (int i = 0; i < a.length; i++) {
						if (a[i] == 1) {
							System.out.println("Object inserted" + i);
						} else {
							System.out.println("Not inserted:");
						}
					}
					break;
				case 3:
					System.out.println("Enter the id to delete record:");
					int id = sc.nextInt();
					int delete = service.deletedetails(id);
					if (delete == 0) {
						System.out.println("No rows deleted:" + delete);
					} else {
						System.out.println(delete + " row deleted");
					}
					break;
				case 4:
					System.out.println("Enter the state:");
					String state = sc.next();
					ArrayList<CovidDetails> statelist = service.getdetailsofstate(state);
					if (statelist == null) {
						System.out.println("NO Data:");
					} else {
						statelist.forEach(p -> System.out.println(p));
					}
					break;
				case 5:
					System.out.println("Enter the id to update:");
					int uid = sc.nextInt();
					System.out.println("Enter the city to update:");
					String ucity = sc.next();
					int update = service.updatedetails(uid, ucity);
					if (update == 0) {
						System.out.println("No rows deleted:" + update);
					} else {
						System.out.println(update + " row deleted");
					}

					break;
				case 6:
					ArrayList<CovidDetails> lists = service.callablestatement();
					if (lists == null) {
						System.out.println("NO Data:");
					} else {
						lists.forEach(p -> System.out.println(p));
					}
					break;

				case 7:
					// service.insertcallablestatement(details);
					break;
				}
			}
		} catch (CovidDetailsDaoException e) {
			System.out.println(e.getMessage());
		} finally {
			service.closeconnection();
		}
	}
}
