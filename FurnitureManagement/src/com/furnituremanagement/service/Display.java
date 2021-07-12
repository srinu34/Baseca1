package com.furnituremanagement.service;

import com.furnituremanagement.model.FurnitureStore;

public class Display {

	public static void display(FurnitureStore[] furniture) {
		for (int i = 0; i < furniture.length; i++) 
		{
			System.out.println("===================================");
			System.out.println("id     :"+furniture[i].getId());
			System.out.println("name   :"+furniture[i].getName());
			System.out.println("volume :"+furniture[i].getVolume());
			System.out.println("====================================");
			
		}
		
	}

}
