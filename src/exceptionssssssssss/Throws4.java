package exceptionssssssssss;

public class Throws4
{
 private String firstName, lastName;
 public void throws4(String firstName,String lastName)throws Exception
 {
    this.firstName=firstName;
 this.lastName=lastName;
 
 }
 void display(){
   System.out.println("Full Name: " +firstName+ " " +lastName);
 }
public static void main(String[] args)throws Exception

{
 Throws4 obj = new Throws4();
  obj.throws4("daram","rohith");
  obj.display();
  }
}