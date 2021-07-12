package com.mt.usermanagement.model;

public class Products {

	private int p_id;
	private String name;
	private double price;
	public Products() {
		super();
	}
	public Products(int p_id, String name, double price) {
		super();
		this.p_id = p_id;
		this.name = name;
		this.price = price;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
