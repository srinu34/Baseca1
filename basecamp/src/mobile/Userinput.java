package mobile;

import java.util.Scanner;

public class Userinput 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		
		Mobile[] mobiles=new Mobile[50];
		boolean flag=true;
		do
		{
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				//1.Add Mobile details to the system and display all mobile present in system.
				//>add mobile details
				mobiles=adddetails();
				//>display all mobile present in system.
				displayallmobiledetails(mobiles);
			break;
			case 2:
				//2.sort all the mobiles based on model and display the details
				//>sorting all the mobiles based on the number
			  Mobile[] sort= sortallmobilemodels(mobiles);
			  //display(sort);
		    break;
			case 3:
				//3.update price for given mobile id and display the details.
				//>update the mobile price using id
			System.out.println("Enter new price:");
			double newprice=sc.nextDouble();
			updatemobileprice(mobiles,newprice);
			break;
			case 4:
				//4.delete mobile details for given mobile id.
				//>delete particular mobile using id.
				deletemobile(mobiles);
			break;
			case 5:
				//5.exit
				exit();
				flag=false;
			default:
				System.out.println("++++Enter valid choice");
			break;
			}
			
		}
		while(flag);
	}
	/*private static void display(Mobile[] mobiles) 
	{
		for (int i = 0; i < mobiles.length; i++)
		{
			 System.out.println(" Mobile Id                   "+mobiles[i].getId());
			 System.out.println("Mobile mobel                 "+mobiles[i].getModel());
			 System.out.println("Mobile price                 "+mobiles[i].getPrice());
			 System.out.println("Mobile dateofmanufacture     "+mobiles[i].getDateofmanufacture());
			 System.out.println();
			
		}
		
	}*/
	
	private static void exit()
	{
		System.out.println("+++++Exit+++++");

	}
	
	private static void deletemobile(Mobile[] mobiles) 
	{
		System.out.println("Enter id which mobile do you want to delete");
		int id=sc.nextInt();
		for (int i = 0; i < mobiles.length; i++)
		{
			if(mobiles[i].getId()==id)
			{
				mobiles[i]=null;
				System.out.println("+++++Deleted Successfully++++++");
			}
			
		}
		
	}
	
	private static void updatemobileprice(Mobile[] mobiles,double newprice) 
	{
	
		System.out.println("Enter id for update price");
		int updateid=sc.nextInt();
		for (int i = 0; i < mobiles.length; i++)
		{
			if(mobiles[i].getId()==updateid)
			{
			 mobiles[i].setPrice(newprice);
			 System.out.println("updated successfully");
			 displayupdateddetails(mobiles[i]);
		    }
		}
		
	}
	
	private static void displayupdateddetails(Mobile mobiles)
	{
		System.out.println("*****Updated Mobile Details******");
		System.out.println();
		System.out.println(" Mobile Id                    "+mobiles.getId());
		 System.out.println("Mobile mobel                 "+mobiles.getModel());
		 System.out.println("Mobile price                 "+mobiles.getPrice());
		 System.out.println("Mobile dateofmanufacture     "+mobiles.getDateofmanufacture());
		 System.out.println();
		
	}
	private static Mobile[] sortallmobilemodels(Mobile[] mobiles)
	{
		Mobile temp;
		for (int i = 0; i < mobiles.length-1; i++) 
		{
			for (int j = 0; j < mobiles.length-1-i; j++) 
			{
				if(mobiles[j].getModel().compareTo(mobiles[j+1].getModel()) > 0)
				{
					 temp=mobiles[j];
					mobiles[j]=mobiles[j+1];
					mobiles[j+1]=temp;
				}
			}
		}
		return mobiles;
		
	}
	
	private static void displayallmobiledetails(Mobile[] mobiles)
	{
	 for (int i = 0; i < mobiles.length; i++) 
	 {
		 System.out.println(" Mobile Id                   "+mobiles[i].getId());
		 System.out.println("Mobile mobel                 "+mobiles[i].getModel());
		 System.out.println("Mobile price                 "+mobiles[i].getPrice());
		 System.out.println("Mobile dateofmanufacture     "+mobiles[i].getDateofmanufacture());
		 System.out.println();
	 }
		
	}
	private static Mobile[] adddetails() 
	{
		System.out.println("Enter how many mobiles do you wnat to add:");
		int nomobiles=sc.nextInt();
		Mobile[] alldetails=new Mobile[nomobiles];
		for (int i = 0; i < alldetails.length; i++)
		{
		   System.out.println("Enter mobile id:");
		   int id=sc.nextInt();
		   System.out.println("Enter mobile model number:");
		   String model=sc.next();
		   System.out.println("Enter mobile price:");
		   double price=sc.nextDouble();
		   System.out.println("Enter mobile dateofmanufacture");
		   String dateofmanufacture=sc.next();
		   
		   alldetails[i]=new Mobile(id,model,price,dateofmanufacture);
		   System.out.println();
		   System.out.println("*****Details Entered Successfully******");
		 
		}
	
		return alldetails;
	}
	

}
