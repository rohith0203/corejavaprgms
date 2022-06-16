package java8;

import java.util.function.BiFunction;
import java.util.function.Function;
interface see
{
	int a(int b,int c);
}
class test111
{
	public int a(int b,int c)
	{
		return b-c;
	}
}
public class MethodReference1 {

	public static void main(String[] args) {
		test111 b11=new test111();
		BiFunction<Integer,Integer,Integer>b111=b11::a;// it is used when there is a return type method onlyyyyyyyyyyyyyyyyy
		int result=b111.apply(2,3);
		System.out.println(result);
	}
}
