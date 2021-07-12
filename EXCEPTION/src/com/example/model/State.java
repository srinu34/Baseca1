package com.example.model;

import java.util.HashSet;
import java.util.Set;

public class State {

	private int id;
	private String name;
	private Set<City> city=new HashSet<>();
	
	public State() {
		super();
	}
	public State(int id, String name, Set<City> city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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
	public Set<City> getCity() {
		return city;
	}
	public void setCity(Set<City> city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
