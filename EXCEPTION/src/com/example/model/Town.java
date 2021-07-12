package com.example.model;

public class Town implements Comparable<Town> {

	private String name;

	public Town(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Town [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Town o) {
		
		return this.name.compareTo(o.name);
	}
}
