package java8;

import java.util.function.BiFunction;

interface seeyou
{
	public void fst(int a,String b);
}
class iwill implements seeyou
{
	public void fst(int a,String b)
	{
		System.out.println(a+b);
	}
}
public class MethodReference2 {
public static void main(String[] args) {
	iwill see=new iwill ();
	seeyou y=see::fst;
	
	y.fst(2,"you cant see me");
}
}
