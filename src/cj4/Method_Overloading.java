package cj4;

class A
{
	public void move(int i,int j)
	{
		System.out.println(i*j);

	}
	public void move(int k)
	{
		System.out.println(k);
	}
}

public class Method_Overloading {
public static void main(String[] args) {
	A a1=new A();
	a1.move(1,4);
	a1.move(0);
}
}
