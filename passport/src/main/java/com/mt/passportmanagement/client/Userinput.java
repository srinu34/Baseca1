package com.mt.passportmanagement.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.mt.passportmanagement.Exception.InvalidNumberException;
import com.mt.passportmanagement.model.PersonDetails;
import com.mt.passportmanagement.service.UserService;

public class Userinput {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UserService service = new UserService();
		service.createconnection();
		try {
			while (true) {
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the id to det passport-details:");
					int id = sc.nextInt();
					service.getdetailsofpassport(id);
					break;

				}
			}
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
		service.closeconnection();
	}
}
