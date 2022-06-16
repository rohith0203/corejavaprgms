package exceptionssssssssss;

public class Throws2 {

	public static void main(String[] args) {
		test();
	}
	public static void test()throws ArithmeticException
	{
		int a=10;
		int b=0;
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("no exception");
		}
		
		
		System.out.println("over");
	}
}
