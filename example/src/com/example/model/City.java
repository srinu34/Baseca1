package com.example.model;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class City implements Comparable<City>{

	private int id;
	private String name;
	private int population;
	private Set<Town> town= new TreeSet<>();

	public Set<Town> getTown() {
		return town;
	}
	public void setTown(Set<Town> town) {
		this.town = town;
	}
	public City(int id, String name, int population, Set<Town> town) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.town = town;
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


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}

//
//	@Override
//	public int compareTo(City o) 
////	{
////		if(population>=o.population)
////			return 1;
////		else if(population==o.population)
////		return 0;
////		else
////			return -1;
//	return (
//	}
	


	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population=" + population + ", town=" + town + "]";
	}

//
//	@Override
//	public int compare(City o1, City o2) {
//		return o1.population-o2.population;
//	}

	@Override
	public int compareTo(City o) {
		if(population>=o.population)
		return 1;
	    else if(population==o.population)
	    return 0;
	    else
		return -1;
	}
	
}
