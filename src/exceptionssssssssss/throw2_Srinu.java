package exceptionssssssssss;

public class throw2_Srinu {
	public static void m(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("person is not eligible ");
		}
		else
		{
			System.out.println("person is eligible to vote");
		}
	}
public static void main(String[] args) {
	m(12);
	
}
}
