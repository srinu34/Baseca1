package com.shopingcart.model;

import java.util.Arrays;

public class Customer {
	private int id;
	private String name;
	private Products[] products;

	public Customer() {
		super();
	}

	public Customer(int id, String name, Products[] products2) {
		super();
		this.id = id;
		this.name = name;
		this.products = products2;
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

	public Products[] getProducts() {
		return products;
	}

	public void setProducts(Products[] products2) {
		this.products = products2;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", products=" + Arrays.toString(products) + "]";
	}

}
