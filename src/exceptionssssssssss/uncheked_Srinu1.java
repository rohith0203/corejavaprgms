package exceptionssssssssss;
import java.util.*;
public class uncheked_Srinu1
{
public static void main(String[] args)
 {
System.out.println("main starts");
Scanner sc=new Scanner(System.in);
String s="hi";
System.out.println("enter the a value");
int a=sc.nextInt();
System.out.println("enter the b value");
int b=sc.nextInt();
	try
	{
		System.out.println(s.charAt(3));
		System.out.println(a/b);
	}
		catch(Exception e)
			{
					System.out.println("see and enter ");
			}
 	}
}
