package test;

import java.util.Date;

public class Student implements Comparable<Student> {
long phn,accountno;
int  bal;
private String name,bank,Branch,date;

public Student(String name,String bank,long phn,long accountno,int bal,String date)
{
this.name=name;
this.bank=bank;
this.phn=phn;
this.accountno=accountno;
this.bal=bal;
this.date=date;
}

@Override 
public String toString() {
	return name ;
}



//@Override
//public int compareTo(Student s1) {
//	return this.name.compareTo(s1.name);
//}

@Override
public int compareTo(Student s1) {
	
	return this.name.compareTo(s1.name);
}







}
