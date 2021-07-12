package com.inventorymanagement.model;



public class Inventory
{
	//id, name, quantity, price_per_unit.
	private int id;
	private String name;
	private int quantity;
	private double priceperunit;
	
	//zero argument constructor.
	public Inventory() {
		super();
	}
	
	//parameter wise constructor.
	public Inventory(int id, String name, int quantity, double priceperunit) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.priceperunit = priceperunit;
	}
	
	
	//get and set the id.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//get and set the name.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//get and set the quantity.
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	//get and set the priceperunit
	public double getPriceperunit() {
		return priceperunit;
	}
	public void setPriceperunit(double priceperunit) {
		this.priceperunit = priceperunit;
	}


}
