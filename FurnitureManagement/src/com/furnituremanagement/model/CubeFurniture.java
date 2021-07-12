package com.furnituremanagement.model;

public class CubeFurniture extends FurnitureStore
{
	private int side;
	
	public CubeFurniture() {
		super();
	}
	public CubeFurniture(int id,String name,double volume,int side) {
		super();
		this.id=id;
		this.name=name;
		this.volume=volume;
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}

  public double findvolume(double side)
  {
	volume=side*side*side;
	return volume;
  }

}
