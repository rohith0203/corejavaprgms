package cj4;

interface KCPD
{
	public void run();
	public void test();
}
abstract class bcc implements KCPD
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
public class OverridingTest2 
{
public static void main(String[] args) 
{
	dd d1=new dd();
	d1.test();
	
	d1.run();
}
}

