package cj4;

interface z111
{
	static int a=10;
	
}
class y111 implements z111
{
	public void get()
	{
	 
	 System.out.println(z111.a);
	}
}
public class Demo {
	
	public static void main(String[] args) {
		y111 y=new y111();
		y.get();

}

}