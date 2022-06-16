package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Ans {
public static void main(String[] args) {
	ArrayList<Student>ay=new ArrayList();
	ay.add(new Student("bownpally",60," Xemploye in techouts"));
	ay.add(new Student("paradise",40,"Yemployee in techouts"));
	Collections.sort(ay,new journey());
	System.out.println("sorting by journeyyyyyy");
	for(Student x:ay)
	{
		System.out.println(x.address+" "+x.journey+" "+x.work);
	}
	Collections.sort(ay,new work());
	System.out.println("sorting by work");
	for(Student y:ay)
	{
		System.out.println(y.address+" "+y.journey+" "+y.work);
	}
}
}
