package com.furnituremanagement.model;

public class RectangleFurniture extends FurnitureStore {

	private double length;
	private double width;
	private double height;
	public RectangleFurniture() {
		super();
	}
	public RectangleFurniture(int id,String name,double volume,double length, double width, double height) {
		super();
		this.id=id;
		this.name=name;
		this.volume=volume;
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getwidth() {
		return width;
	}
	public void setwidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double findvolume(double length,double width,double height)
	{
		volume=length*width*height;
		return volume;
	}
}
