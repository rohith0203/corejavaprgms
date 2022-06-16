package exception_handling;
import java.util.*;
public class Uncheked_Srinu
{
public static void main(String[] args)
 {
System.out.println("main starts");
Scanner sc=new Scanner(System.in);
String s="hi";
System.out.println("enter the values");
int a=sc.nextInt();
int b=sc.nextInt();
	try
	{
		System.out.println(s.charAt(3));
		System.out.println(a/b);
	}
		catch(ArithmeticException ae)
			{
					System.out.println("see and enter ");
			}
 	}
}
