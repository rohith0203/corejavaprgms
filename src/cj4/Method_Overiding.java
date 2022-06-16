package cj4;
class a11
{
	public void test() {
		System.out.println("hi bro are you wiiling to come to trip");
	}
}
class b11 extends a11
{
	public void test1()
	{
		System.out.println("naaaa bro . im suffering from fever ");
	}
}
class c11 extends b11
{
	public void test2()
	{
		System.out.println("i dont know");
	}
}
public class Method_Overiding {
	public static void main(String[] args) {
		c11 c1=new c11();
		c1.test();
		c1.test1();
	}

}
