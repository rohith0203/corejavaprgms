package cj3;



public class AAA {
	public static void main(String[] args) {
		

		dd d1=new dd();
		d1.test();
		
		d1.run();
	}
}
interface a1111
{
	public void run();
	public void test();
}
abstract class bcc implements a1111
{
	public void run()
	{
		System.out.println("runing sucessgully");
	}
}
abstract class cc extends bcc
{
	
}
class dd extends cc
{
	public void test()
	{
		System.out.println("tested");
	}
}