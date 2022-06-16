package Enum_Regex;

public class Enum_demo {
	public enum Measurements
	{
	LENGTH,BREADTH,HEIGHT
	}
	public static void main(String[] args) {
		for(Measurements m:Measurements.values())
		{
		System.out.println(m);
	}
		//for index purpose
		System.out.println("Index of breadth:"+Measurements.valueOf("BREADTH").ordinal());
		// for waste purpose
		System.out.println(Measurements.valueOf("LENGTH"));
	}

}
