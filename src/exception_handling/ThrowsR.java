package exception_handling;

class Thr {

public static void a(int age)
{
	
	if(age<18)
	{
		throw new ArithmeticException("ooover");
	}
     
}
}

public class ThrowsR
{
public static void main(String[] args)
{
	
	Thr.a(1);
}
}
