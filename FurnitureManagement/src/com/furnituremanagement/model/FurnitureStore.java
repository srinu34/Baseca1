package com.furnituremanagement.model;

public class FurnitureStore 
{
	
 protected int id;
 protected String name;
 protected double volume;

public double getVolume() {
	return volume;
}
public void setVolume(double volume) {
	this.volume = volume;
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
public double findvolume()
{
	return 0.0;
}
@Override
public String toString() {
	return "FurnitureStore [id=" + id + ", name=" + name + ", volume=" + volume + "]";
}

}
