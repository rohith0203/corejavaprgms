package java8;

import java.util.function.Function;

interface test
{
public void sub(String s1,String s2,String s3,int marks);

}
class Lambda1
{
	public static void main(String[] args) {
		//Function<Integer,Integer>f=i->i*i;
		//System.out.println(f.add(6));
		test t=(s1,s2,s3,marks)->{
			System.out.println((s1+" "+s2+" "+s3));
			};
		t.sub("maths","telugu","science",123);
	}
}
