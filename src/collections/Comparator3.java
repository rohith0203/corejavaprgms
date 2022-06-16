package collections ;
import java.util.*;
import java.io.*;
class Student11
{
	int rollno,age;
	String name;
	public Student11(String name,int rollno,int age)
{this.name=name;
this.rollno=rollno;
this.age=age;
}
}

class Age implements Comparator<Student11>//if u want to remove <student11> remove the below lines
{
	/*public int Compare(Object o1,Object o2)
	{
		Student11 s1=(Student11)o1;
		Student11 s2=(Student11)o2;
		if(s1.age==s2.age)
		{
			return 0;
		}
		else if(s1.age>s2.age)
		{
			return 1;
		}else
		{
			return 0;
		}
	}*/

	@Override
	public int compare(Student11 o1, Student11 o2) {
		// TODO Auto-generated method stub
		
		if(o1.age==o2.age)
		{
			return 0;
		}
		else if(o1.age>o2.age)
		{
			return 1;
		}else
		{
			return 0;
		}
	
	}

	
	
	

	
}
public class Comparator3
{
	public static void main(String[] args) {
	ArrayList<Student11>al=new ArrayList();
	al.add(new Student11("heroo",1234,21));
	al.add(new Student11("Zerooo",314,23));
	al.add(new Student11("perooo",14,20));
	
		Collections.sort(al,new Age());
		for(Student11 x:al)
		{
			System.out.println(x.name+" "+x.rollno+" "+x.age+" ");
		}
		
		
		
		
		
		
	}
	
	
}










