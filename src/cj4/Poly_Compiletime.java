package cj4;

class compile
{
	public static void add(int i,double j)
	{
		System.out.println(i*j);
	}
	public void sub(int i,String j,boolean k)
	{
		System.out.println(i);
		System.out.println(j+""+k);
	}
}
public class Poly_Compiletime {
	public static void main(String[] args) {
		compile.add(3,2);
		compile c1=new compile();
		c1.sub(11, null, false);
	}

}
