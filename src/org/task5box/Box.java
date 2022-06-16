package org.task5box;

public class Box
{
	private double length;  
	private double  breadth;
	private double height;
	public  Box(double length, double breadth,double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}

	public double Area()
	{
		return 2*length*breadth*height;
	}

	public double Volume()
	
	{
		return length*breadth*height;
	}
	
}