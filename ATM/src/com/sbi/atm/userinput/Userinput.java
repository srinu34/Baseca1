package com.sbi.atm.userinput;

import java.sql.SQLException;
import java.util.Scanner;

import com.sbi.atm.atmregistration.registration;
import com.sbi.atm.trancation.Atm;

public class Userinput 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Atm a1=new Atm();
		registration r1=new registration();
	    r1.createconnection();
	    try
	    {
	while(true)
		{
		System.out.println("Welcome to SBI atm:");
		System.out.println("Choose 1 for withdraw:");
		System.out.println("Choose 2 for deposit:");
		System.out.println("Choose 3 for checkbalance:");
		System.out.println("choose 4 for checkAccDetails:");
		System.out.println("choose 5 for Exit:");
		System.out.println("Select the operatin you want to perform:");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Enter  amount to be Withdrawn:");
				double withdraw=sc.nextDouble();
				System.out.println("Enter pass(or)ID to be Withdrawn");
				int withrawid=sc.nextInt();
				a1.setAmount(withdraw);
				r1.withdraw(a1,withrawid);
				break;
			case 2:
				System.out.println("Enter amount to be deposit:");
				double deposit=sc.nextDouble();
				System.out.println("Enter pass(or)ID to be deposit:");
				int depositid=sc.nextInt();
				a1.setAmount(deposit);
				r1.deposit(a1, depositid);
				break;
			case 3:
				System.out.println("Enter ID check Available balance:");
				int id=sc.nextInt();
				r1.showbalance(id);
				break;
			case 4:
				System.out.println("Enter the ID to get Details:");
				int details=sc.nextInt();
				r1.showdetails(details);
				break;
			case 5:
				System.out.println("Thank you:");
				System.exit(0);
			
				break;
		}
	   }
	  }
	catch(SQLException e)
	{
		e.printStackTrace();
	}
		
		r1.closeconnection();
	}
}
