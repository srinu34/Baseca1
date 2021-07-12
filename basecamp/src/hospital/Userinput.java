package hospital;

import java.util.Scanner;
public class Userinput
{
	
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
    	try
    	{
    	System.out.println("Enter How Many number of Patients in Hospital:");
    	int nopatients=sc.nextInt();
    	Patients patient[]=new Patients[nopatients];
    	boolean flag=true;
    	do
    	{
    	System.out.println("Enter the choice:");
    	int choice=sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    	//1.Add patients details to the record.
    	 patient=addpatientdetails();
    	 
    	 break;
    	 
    	case 2:
    	//2.Delete the particular details for outgoing patient.
    	deletePatient(patient);
    	break;
    	
    	case 3:
    	//3.Display patients treated by particular illness
    		//-->Search the patients who are affected illness.
    		//-->Display all patient who are treated.
    	System.out.println("Enter illness of which you want patients list:");
        String illness=sc.next();
    	searchbypatientillness(patient,illness);
    	break;
    	
    	case 4:
        //4.Display patients having same illness.
    	displaypatientshavingsameillness(patient);
    	break;
    	
    	case 5:
    	//5.Display patient name who have billed lowest
    		//-->check bill list.
    		//-->Display lowest bill paid patient.
    		
    	paidlowBill(patient);
    	break;
    	case 6:
    	//6.exit.
    	exit();
    	flag=false;
    	default:
         System.out.println("Enter Valid Choice");
    	break;
    	}
      }
    	while(flag);
    }
    catch(Exception e)
    {
    	System.out.println("exception handled");
    	
    }
    }
    
    private static void exit() 
    {
	 System.out.println("///////Exit\\\\\\\\");
		
	}
    
	private static void paidlowBill(Patients[] patient)
    {
    	
    	for (int i = 0; i < patient.length; i++) 
    	{
    		for (int j = 0; j < patient.length; j++) 
    		{
    		if(patient[i].getBillamount()<patient[j].getBillamount())
    		{
    			System.out.println("Lowest bill Paid Patient Name:"+patient[i].getName());
    		}
			
		    }
    	}
	}
	
	
	private static void displaypatientshavingsameillness(Patients[] patient) 
    {
		for (int i = 0; i < patient.length; i++)
		{
			for (int j = 0; j < patient.length; j++) 
			{
			if(patient[i].getIllnessoccurred().equals(patient[j].getIllnessoccurred()))
		        {
				displaydetails(patient[i]);
		        }
		    }
	    } 
		
	}
	private static void displaydetails(Patients patient)
	{
		System.out.println("******Details Of Same Illness Patient******");
		System.out.println("name                   :"+patient.getName());
		System.out.println("number of days admitted:"+patient.getNumberofdaysadmitted());
		System.out.println("illness accured        :"+patient.getIllnessoccurred());
		System.out.println("bill amount            :"+patient.getBillamount());
		System.out.println("doctor treated         :"+patient.getDoctortreated());
		
		System.out.println();	
	}
	
	private static void searchbypatientillness(Patients[] patient, String illness)
    {   
        //check each and every,one treated print details
		for (int i = 0; i < patient.length; i++)
		{
			if(patient[i].getIllnessoccurred().equals(illness))
				
				display(patient[i]);
		}
	
	}
    private static void display(Patients patient)
    {
    	     System.out.println("====Details Of an illness patients=====");
    	     
			System.out.println("name                   :"+patient.getName());
			System.out.println("number of days admitted:"+patient.getNumberofdaysadmitted());
			System.out.println("illness accured        :"+patient.getIllnessoccurred());
			System.out.println("bill amount            :"+patient.getBillamount());
			System.out.println("doctor treated         :"+patient.getDoctortreated());		
			System.out.println();
		
    }
    
    
	private static Patients[] addpatientdetails()
    {
    	System.out.println("Enter how many number of patients details do you what enter:");
    	int count=sc.nextInt();
    	Patients[] alldetails=new Patients[count];
    	for (int i = 0; i < alldetails.length; i++) 
    	{
    	System.out.println("Enter patient name:");
    	sc.nextLine();
    	String name=sc.nextLine();
    	System.out.println("Number of days admitted :");
        int numberofdaysadmitted=sc.nextInt();
        System.out.println("Illness  occurred name");
    	String illnessoccurred=sc.next();
    	System.out.println("total bill amount");
        double billamount=sc.nextDouble();
        System.out.println("doctor treated or not :");
    	String doctortreated=sc.next();
    	   
     alldetails[i]=new Patients(name,numberofdaysadmitted,illnessoccurred,billamount,doctortreated);
    System.out.println("============Details Entered Successfully==============");
    	   
    	} 
    	return alldetails;
     
      }
    
    
    	private static void deletePatient(Patients[] patient)
    	{
    		System.out.println("Enter patient to delete :");
    		String name=sc.next();
    		for (int i = 0; i < patient.length; i++) 
    		{
    			if(patient[i].getName().equals(name))
    			{
    				patient[i]=null;
			   System.out.println("====Patient deleted int the records successfully======");
    			}
    	    }
    	}
  
    
  }    

