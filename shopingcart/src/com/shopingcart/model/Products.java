package com.shopingcart.model;

public class Products {

	private int id;
	private String name;
	private double price;
	private int qty;

	public Products() {
		super();
	}

	public Products(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
