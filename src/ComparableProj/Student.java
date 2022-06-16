package ComparableProj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Student1 implements Comparable<Student1> {
	int empid;
	String ename,college;
	public Student1(int empid,String ename,String college)
	{
		this.empid=empid;
		this.ename=ename;
		this.college=college;
	}
	@Override
	public int compareTo(Student1 o) {		
		return ename.compareTo(o.ename);
	}
	@Override
	public String toString() {
		return "Student1 [" + empid + " : " + ename + " : " + college + "]";
	}
	
	
	
	
}
public class Student
{
	public static void main(String[] args) {
		
		//Creating a hashMap
		Map<Integer, Student1> h =new HashMap<Integer, Student1>();
		h.put(1, new Student1(01,"name1","college1"));
		h.put(534, new Student1(02,"name2","college2"));
		h.put(3098, new Student1(03,"name3","college3"));
		h.put(48, new Student1(04,"name4","college4"));
		h.put(55, new Student1(05,"name5","college5"));
		
		
		System.out.println("before sorting: ");
		for(Map.Entry<Integer, Student1> x : h.entrySet() ) {
			 System.out.println(x.getKey()+" -> "+x.getValue().ename);
		 }
		 	
		System.out.println("--------------------------------------------------");
		
		
		//Converting hashmap into list
		List<Map.Entry<Integer, Student1>> list = new ArrayList<Map.Entry<Integer, Student1>>(h.entrySet());
		
		//sorting list(converted hashmap) using Collections Class
		 Collections.sort(list,(o1,o2) -> (o1.getValue()).compareTo(o2.getValue()));
		 
		 
		 //Creating new empty linkedHashMap
		 Map<Integer, Student1> sortedMap  =new LinkedHashMap<Integer, Student1>();
		 
		 //adding sorted entries into linkedHashMap
		 for(Map.Entry<Integer, Student1> x : list) {
			 sortedMap.put(x.getKey(), x.getValue());
		 }
		 
		 //Printing sorted Map
		 for(Map.Entry<Integer, Student1> x : sortedMap.entrySet() ) {
			 System.out.println(x.getKey()+" -> "+x.getValue().ename);
		 }
		 	 
		
	}
} 
