package com.furnituremanagement.model;

public class CylinderFurniture  extends FurnitureStore{
	private double radius;
	private double height;
	public CylinderFurniture() {
		super();
	}
	public CylinderFurniture(int id,String name,double volume,double radius, double height) {
		super();
		this.id=id;
		this.name=name;
		this.volume=volume;
		this.radius = radius;
		this.height = height;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

public double findvolume(double radius,double height)
{
	volume=(22/7)*(radius*radius)*height;
	return volume;
}
	
}
