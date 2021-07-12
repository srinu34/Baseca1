package com.furnituremanagement.service;

import com.furnituremanagement.model.FurnitureStore;

public class FindMax {

	public static void findmax(FurnitureStore[] furniture)
	{
	double maximum=0.0;
	FurnitureStore fun=null;
	for (int i = 0; i < furniture.length; i++)
	{
		if(furniture[i].getVolume()>maximum)
		{
		    maximum=furniture[i].getVolume();	
		    fun=furniture[i];
		}
	   }
	System.out.println(maximum);
	System.out.println(fun);
	}
}
