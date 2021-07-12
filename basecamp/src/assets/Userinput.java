package assets;

import java.util.Scanner;


public class Userinput 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		//1.add asset details to the system and display all asset details
		//>add asset details
		//>display all asset details
		//2.search assets for given month and sort the data by model
		//example.if input is provided as feb it should display details of all assets allotted in the month of feb sorted by model
		//>search assert for the given month
		//>sort the all model
		//?dispaly the given month all assert details
		//3.display total quantity allotted for given model
		//example. if input is provided as"hp" display total quantity allotted by summing up all months
		//display the details total quantity details of given model
		//4.update quantity for given model and display the updated details
		//>update the quantity for given model
		//>display the updated details
		//5.exit
		Assets[] assets=new Assets[50];
		boolean flag=true;
		do
		{
			System.out.println("Enter choice");
			int ch=sc.nextInt();
		
			switch(ch)
			{
			case 1:
				assets=adddetails();
				displayalldetails(assets);
			break;
			case 2:
				System.out.println("Enter the month for assets");
				String month=sc.next();
				Assets[] searchdetails=searchAssets(assets,month);
				Assets[] sorteddata=sortedbymodel(searchdetails);
				 dispalyallmonthoAssets(sorteddata,month);
				break;
			case 3:
				dispalytotalQuantity(assets);
				break;
			case 4:
				updateQuantity(assets);
				break;
			case 5:
				exit();
				flag=false;
				break;
				
			default:
				System.out.println("Enter valid choice:");
			break;
			}
		}
		while(flag);
	}
	private static void exit() 
	{
		System.out.println("======Successfully Exit========");
		
	}
	private static void updateQuantity(Assets[] assets)
	{

	   System.out.println("Enter model for update Quantity");
	   String model=sc.next();
		System.out.println("Enter new Quantity ");
		int newQuantity=sc.nextInt();
		for (int i = 0; i < assets.length; i++)
		{
			if(assets[i].getModel().equals(model))
			{
				assets[i].setQuantity(newQuantity);
			 System.out.println("updated successfully");
			 displayupdateddetails(assets[i]);
		    }
		}
	}
	private static void displayupdateddetails(Assets assets1) 
	{
		
		System.out.println("========================");
		System.out.println("sno          :"+assets1.getSno());
		System.out.println("model        :"+assets1.getModel());
		System.out.println("allottedmonth:"+assets1.getAllottedmonth());
		System.out.println("quantity     :"+assets1.getQuantity());
		System.out.println("========================");
		
		
	}
	private static void dispalytotalQuantity(Assets[] assets)
	{
		System.out.println("Enter the model");
		String model=sc.next();
		for (int i = 0; i < assets.length; i++) 
		{
			if(assets[i].getModel().equals(model))
			{
				System.out.println("total Quantity : "+assets[i].getQuantity());

			}
			
		}
		
	}
	private static Assets[] searchAssets(Assets[] assets,String month) 
	{  
		Assets[] searchdata =assets;
		int c=0;
		for (int i = 0; i < searchdata.length; i++)
		{
			if(searchdata[i].getAllottedmonth().equals(month))
			{
				searchdata[c]=searchdata[i];
				c++;
			}
			
		}
	return searchdata;
	}
	private static void dispalyallmonthoAssets(Assets[] sorteddata,String month) 
	{
		for (int i = 0; i < sorteddata.length-1; i++) 
		{
			if(sorteddata[i].getAllottedmonth().equals(month))
			{
			System.out.println("========================");
			System.out.println("sno          :"+sorteddata[i].getSno());
			System.out.println("model        :"+sorteddata[i].getModel());
			System.out.println("allottedmonth:"+sorteddata[i].getAllottedmonth());
			System.out.println("quantity     :"+sorteddata[i].getQuantity());
			System.out.println("========================");
		
			}
		}
	}
	private static Assets[] sortedbymodel(Assets[] searchdata)
	{
		
	for (int i = 0; i < searchdata.length-1; i++) 
	{
		for (int j = 0; j < searchdata.length-1-i; j++) 
		{
			if(searchdata[j].getModel().compareTo(searchdata[j+1].getModel()) > 0)
			{
				Assets temp=searchdata[j];
				searchdata[j]=searchdata[j+1];
				searchdata[j+1]=temp;
			}
		}
	}
	return searchdata;
}
	private static void displayalldetails(Assets[] assets) 
	{
		for (int i = 0; i < assets.length; i++) 
		{
			System.out.println("========================");
			System.out.println("sno          :"+assets[i].getSno());
			System.out.println("model        :"+assets[i].getModel());
			System.out.println("allottedmonth:"+assets[i].getAllottedmonth());
			System.out.println("quantity     :"+assets[i].getQuantity());
			System.out.println("========================");
			
		}
	
		
	}
	private static Assets[] adddetails() 
	{
		System.out.println("Enter how many assets details do you want to enter:");
		int noasset=sc.nextInt();
		Assets[] alldetails=new Assets[noasset];
		for (int i = 0; i < alldetails.length; i++) 
		{
			System.out.println("=====================================");
			System.out.println("Enter sno:");
			int sno=sc.nextInt();
			System.out.println("Enter model:");
		    String model=sc.next();
		    System.out.println("Enter allottedmonth");
		    String allottedmonth=sc.next();
		    System.out.println("Enter Quantity:");
            int quantity=sc.nextInt();
            alldetails[i]=new Assets(sno,model,allottedmonth,quantity);
            System.out.println("=====Details Entered Successfully======");
            System.out.println();
			
		}
		
		return alldetails;
	}

}
