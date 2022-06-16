
package exception_handling;

public class Propagation {



	public void n()
	{
		//Propagation p1=new Propagation();
		//p1.o();
		int a=10;
		int b=0;
		System.out.println(a/b);
	}
	public void o()
	{
		try
		{
			//Propagation p1=new Propagation();
		n();
		}
		catch(ArithmeticException e )
		{
			System.out.println("error occured");
		}
	}
public static void main(String[] args)  {
	Propagation p1=new Propagation();
	p1.o();
}

}

