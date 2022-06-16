
package exceptionssssssssss;
class ex
{
	public static void test()
	{
		int i=100;
		int j=0;
		try
		{
			System.out.println(i/j);
		}
		catch(Exception e)
		{
			//e.printStackTrace(); //for determine the which exception is occured 
			System.out.println("you can proceed");
		}
		
		System.out.println("oyoooo");
		
	}
}

public class Throw1_Srinu {
	public static void main(String[] args) {
		ex.test();		
	}

}
