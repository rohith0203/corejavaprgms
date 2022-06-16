package exceptionssssssssss;

public class Propagation2 {
	public static void m()throws Exception
	{
		n();
	}
	public static void n()throws Exception
	{
		o();
	}
	
	public static void o()throws Exception
	{
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);			
		}
		catch(Exception e)
			{
			System.out.println("iam flowiong ");
			}
		j();
	}
	public static void j()throws ArithmeticException
	
	{
		System.out.println("abooo");
	}
	public static void main(String[] args)throws Exception {
		m();
		System.out.println("flow contineous");
		//j();
	}
}
