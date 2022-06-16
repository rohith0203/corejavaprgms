package org.task5box;


public class Main {
public static void main(String[] args) {
	Box b1=new Box(3.9d,3.5d, 1.6d);
	Box3d b=new Box3d(12.9d,23.9d, 12.6d);
	System.out.println("Area"+b1.Area());
	System.out.println("volume"+b1.Volume());
	System.out.println("Area1"+b.Area1());
	System.out.println("volume1"+b.Volume1());
}
}
