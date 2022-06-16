package cj4;
 class A1
{
	public int c=20;
	public void test()
	{
		System.out.println("hiiiii");
		
	}
}
class B extends A1
{
	public void display()
	{
	System.out.println(c);
	test();
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		B b1=new B();
		b1.display();
	}
}
