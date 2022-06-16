package cj4;

class Student{  
int rollno;  
String name;  
float fee;  
Student(int a,String b,float c){  
rollno=a;
name=b;
fee=c;
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
class This{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"suit",6000f);  
s1.display();  
s2.display();  
}}  