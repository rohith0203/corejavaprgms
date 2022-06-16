package exception_handling;

public class TryCatch {
	public static void main(String[] args) {
		int a=12;
		int b=0;
		//System.out.println(a/b);
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("12 is not divisible by 0");
		}
	}

}
