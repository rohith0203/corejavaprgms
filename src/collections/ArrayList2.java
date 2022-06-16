package collections;

import java.util.ArrayList;

class Series
{
	int id;
	String name,rating,worldwide;
	public Series(int id,String name,String rating,String worldwide)
	{
		this.id=id;
		this.name=name;
		this.rating=rating;
		this.worldwide=worldwide;
	}
	@Override
	public String toString() {
		return "id"+id+"name:"+name+"rating:";
	}
	
	
}
public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<Series> a=new ArrayList<Series>();
		Series s1=new Series(121,"now you can see me","5 star","universe");
		Series s2=new Series(122,"no see me","1 star","u konwn");
	a.add(s1);
	a.add(s2);
//	for(Series a2:a)
//	{
//		System.out.println(a2);
//	}
		a.forEach(Series->{System.out.println(Series.worldwide);});
	}

}
