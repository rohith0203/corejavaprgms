package test;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
	
		Student s = new Student("rohith", "SBI", 0, 0, 0,"Friday");
		Student s1 = new Student("ro", "SBI", 0, 0, 0,"saturday");
		Student s2 = new Student("hit", "SBI", 0, 0, 0,"sunday");
		System.out.println("Student: "+s);
//		System.out.println(s.get);
		
		ArrayList<Student>  students = new ArrayList<Student>();
		students.add(s2);
		students.add(s);
		students.add(s1);
		
		for(Student x : students) {
			System.out.println(x);
		}
		
		Date date = new Date();
		System.out.println(date);

		
	}

}
