package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class Movie
{
	int id;
	String name,rating,worldwide;
	public Movie(int id,String name,String rating,String worldwide)
	{
		this.id=id;
		this.name=name;
		this.rating=rating;
		this.worldwide=worldwide;
	}
	@Override
	public String toString() {
		return id+":"+name+" ^^"+rating+"*"+worldwide;
	}
	
	
	
}
public class HashMap3 {
	public static void main(String[] args) {
		
		HashMap<Integer,Movie>m=new HashMap();
		Movie m1=new Movie(101,"KGF 2","5 star","world wide");
		Movie m2=new Movie(102,"dill","4 star","TS & AP");
		Movie m3=new Movie(103,"akanda","3 starrrrr"+ "","State wide");
		
		m.put(1, m3);
		m.put(2, m2);
		m.put(3, m1);

		
		for(Map.Entry<Integer,Movie> x : m.entrySet())
		{
		
			System.out.println(x/*.getKey()+" "+x.getValue()*/);
		}
	}




}
