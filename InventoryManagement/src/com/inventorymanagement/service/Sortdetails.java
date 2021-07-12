package com.inventorymanagement.service;

import com.inventorymanagement.model.Inventory;

public class Sortdetails 
{

	public static Inventory[] sortQuantityDetails(Inventory[] inventory)
	{
		Inventory[] sort=inventory;
		for (int i = 0; i < sort.length-1; i++) 
		{
			for (int j = 0; j < sort.length-1-i; j++)
			{
				if(sort[j].getQuantity() > sort[j+1].getQuantity())
				{
					Inventory temp=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=temp;
					
				}
				
			}
			
		}
		return sort;
	}

}
