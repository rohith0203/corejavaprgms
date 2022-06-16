

package exception_handling;

public class MulCatch {
public static void main(String[] args) {
	int a=12;
	int b=0;
	
	try
	{
		int c[]=new int[2];
		
		System.out.println(a/b);
		System.out.println(c[3]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("enter the valid in-put");
	}
//	catch(Exception e)
//	{
//		System.out.println("see");
//	}
}
}
