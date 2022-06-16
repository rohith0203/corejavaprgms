package org.task5box;

public class Box3d extends Box {
	
	private double length;  
	private double  breadth;
	private double height;
	
	public Box3d(double length, double breadth, double height) {
		super(length, breadth, height);
		this.length = length;
		this.breadth=breadth;
		this.height=height;
	}

	public double Area1()
	{
		return 2*length*breadth*height;
	}

	public double Volume1()
	
	{
		return length*breadth*height;
	}
}
