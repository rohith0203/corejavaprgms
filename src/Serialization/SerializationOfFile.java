package Serialization;

import java.io.*;
import java.io.Serializable;

class Student  implements Serializable
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class SerializationOfFile{
public static void main(String[] args) {
	
	try
	{
		Student s1=new Student(121,"koma");
		
	FileOutputStream f=new FileOutputStream("src.txt");
	ObjectOutputStream f1=new ObjectOutputStream(f);
	f1.writeObject(s1);
	f1.flush();
	f1.close();
	System.out.println("successful");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
