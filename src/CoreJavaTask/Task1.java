package CoreJavaTask;
import java.util.Scanner;
class Cellphone
{
	public void contact(String NameOfTheContact)
	{
		System.out.println("name:"+NameOfTheContact);
	}
	public void contact(long phn1)
	{
		System.out.println("phn1:"+phn1);
		
	}
	public void contact(int phn2)
	{
		System.out.println("phn2:"+phn2);
	}
}
public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the contact Name");
		String s=sc.next();
		System.out.println("Enter the primary phno");
		long l=sc.nextLong();
		System.out.println("Enter the Secondary phno");
		long i=sc.nextLong();
		System.out.println("contact saved");
		
		Cellphone c=new Cellphone();
		c.contact(s);
		c.contact(l);
		c.contact(i);
		
	}
}
