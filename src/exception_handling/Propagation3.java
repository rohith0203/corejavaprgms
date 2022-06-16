package exception_handling;

public class Propagation3 {
	public static void m()throws ArithmeticException
	{
		n();
	}
	public static void n()throws ArithmeticException
	{
		o();
	}
	
	public static void o()throws ArithmeticException
	{
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);			
		}
		catch(ArithmeticException e)
			{
			System.out.println("iam flowiong ");
			}
			j();


	  
	}
	public static void j()throws ArithmeticException
	
	{
		System.out.println("abooo");
	}
	public static void main(String[] args)throws ArithmeticException {
		m();
		System.out.println("flow contineous");
		//j();
	}

}
