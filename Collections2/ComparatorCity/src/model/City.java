package model;

import java.util.Comparator;

public class City implements Comparable<City>{

	private int id;
	private String name;
    int population;
	public int getId() {
		return id;
	}
	public City(int id, String name, int population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nId\t:"+id+"\nName\t:"+name+"\nPopulation\t:"+population;
	}
	@Override
	public int compareTo(City population) {
		return this.population > City.population ? 1 : this.age < City.population ? -1 : 0;
	}
	
}
