package com.furnituremanagement.service;

import java.util.Scanner;

import com.furnituremanagement.model.CubeFurniture;
import com.furnituremanagement.model.CylinderFurniture;
import com.furnituremanagement.model.FurnitureStore;
import com.furnituremanagement.model.RectangleFurniture;


public class Adddetails {

    static Scanner sc=new Scanner(System.in);
	public static FurnitureStore[] addfurniture() 
	{
		double volume=0.0;
	   System.out.println("Enter how many furniture details do you want to enter:");
		int nooffurniture=sc.nextInt();
		FurnitureStore[] alldetails=new FurnitureStore[nooffurniture];
		for (int i = 0; i < alldetails.length; i++) 
		{
		System.out.println("Enter the furniture name:/cube/rectangle/cylinder/sphere");
		String type=sc.next();
		switch(type)
		{
		case "cube":
			System.out.println("=====================================");
			System.out.println("Enter the id:");
			int cuid=sc.nextInt();
			String cuname=type;
			System.out.println("Enter the side:");
			int side=sc.nextInt();
		    CubeFurniture cube=new CubeFurniture();
		    volume=cube.findvolume(side);
		    cube.setId(cuid);
		    cube.setName(cuname);
		    cube.setSide(side);
		    cube.setVolume(volume);
		    alldetails[i]=cube;
            System.out.println("=====Details Entered Successfully======");
            System.out.println();
            break;
			
		case "rectangle":
			System.out.println("=====================================");
			System.out.println("Enter the id:");
			int recid=sc.nextInt();
			String recname=type;
			System.out.println("Enter the length:");
			double length=sc.nextDouble();
			System.out.println("Enter the width:");
			double width=sc.nextDouble();
			System.out.println("Enter the height");
			double height=sc.nextDouble();
		    RectangleFurniture rectangular=new RectangleFurniture();
		    volume=rectangular.findvolume(length,width,height);
		    rectangular.setId(recid);
		    rectangular.setName(recname);
		    rectangular.setLength(length);
		    rectangular.setHeight(height);
		    rectangular.setwidth(width);
		    rectangular.setVolume(volume);
		    alldetails[i]=rectangular;
            System.out.println("=====Details Entered Successfully======");
            System.out.println();
            break;
		case "cylinder":
			System.out.println("=====================================");
			System.out.println("Enter the id:");
			int cyid=sc.nextInt();
			String cyname=type;
			System.out.println("Enter the radius:");
			double radius=sc.nextDouble();
			System.out.println("Enter the height");
			double cyheight=sc.nextDouble();
		    CylinderFurniture cylinder=new CylinderFurniture();
		    volume=cylinder.findvolume(radius,cyheight);
		    cylinder.setId(cyid);
		    cylinder.setName(cyname);
		    cylinder.setRadius(radius);
		    cylinder.setHeight(cyheight);
		    cylinder.setVolume(volume);
		    alldetails[i]=cylinder;
            System.out.println("=====Details Entered Successfully======");
            System.out.println();
            break;
		}
	  }
		return alldetails;
   }
}
