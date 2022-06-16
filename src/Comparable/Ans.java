package Comparable;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ans {
public static void main(String[] args) {
	HashMap<Student,Integer> t=new HashMap<Student,Integer>();
	Student s1=new Student(101, 123456789, 123456789, 1000, "ads", "adas", "adasdf", "12345");
	Student s2=new Student(105, 123456789, 123456789, 1000, "ads", "adas", "adasdf", "12345");
	Student s3=new Student(102, 123456789, 123456789, 1000, "ads", "adas", "adasdf", "12345");
	Student s4=new Student(100, 123456789, 123456789, 1000, "ads", "adas", "adasdf", "12345");
	Student s5=new Student(106, 123456789, 123456789, 1000, "ads", "adas", "adasdf", "12345");
	t.put(s1,1);
	t.put(s2,3);
	t.put(s3,2);
	t.put(s4,100);
	t.put(s5,6);
	
	
	/*for(Map.Entry m:t.entrySet() )
	{
	System.out.println(m.getKey()+" "+m.getValue());
     }*/
	
TreeMap<Student,Integer> li=new TreeMap<>(t);
	for(Map.Entry m:li.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}

