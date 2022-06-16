package java8;

interface A
{
	  public int b(int a,int b);
}
public class MethodReference {
	public static int b(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
public static void main(String[] args) {
	A a1=MethodReference::b;
	a1.b(2,3);
}
}
