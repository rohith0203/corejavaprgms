package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student1
{
	String name;
	int age;
	long phn;
	String area;
	public Student1(String name,int age,long phn,String area)
	{
		this.name=name;
		this.age=age;
		this.phn=phn;
		this.area=area;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", phn=" + phn + ", area=" + area + "]";
	}
	
}
public class Student {
	public static void main(String[] args) {
		List<Student1>s=new ArrayList<Student1>();
		s.add(new Student1("rohith",21,9010155748l,"bownpally"));
		s.add(new Student1("srinu",23,155748l,"paradise"));
		s.add(new Student1("charan",21,9010148l,"kondapur"));
		s.add(new Student1("devi",24,748l,"lingampally"));
		//Double l=s.stream().collect(Collectors.summingDouble(Student1->Student1.age));// it will add the total no of age in the student1 class
		//System.out.println(l);
		List<Student1>l1=s.stream().sorted((i1,i2)->(i1.age>i2.age)?1:(i1.age<i2.age)?-1:0).collect(Collectors.toList());
		System.out.println(l1);
		
	}

}
