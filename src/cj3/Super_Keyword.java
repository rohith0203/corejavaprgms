package cj3;

class a
{
	public int i=12;
}
class b extends a
{
	public void m()
	{
	System.out.println(super.i);//by using super we can derive features from the parent class
	}
	
}
public class Super_Keyword {
	public static void main(String[] args) {
		b b1=new b();
		b1.m();
	}

}
