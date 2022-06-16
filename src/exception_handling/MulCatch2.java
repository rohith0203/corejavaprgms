package exception_handling;

public class MulCatch2 {
public static void main(String[] args) {
	int a=12;
	int b=0;
	String s="asd";


	try
	{
	 System.out.println(a/b);
		System.out.println(s.charAt(4));
	}
	catch(ArithmeticException e)
	{
		System.out.println("by zero");
	}
	catch(StringIndexOutOfBoundsException e )
	{
		System.out.println("enter the valid index in-put");
	}
	/*catch(Exception e)
     {
		System.out.println("see");
	  }*/
	System.out.println("main ends");
}
}
