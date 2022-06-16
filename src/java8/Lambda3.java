package java8;
interface oil
{
	void purifiedoil();
}
public class Lambda3 {
	public  void purifiedoil()
	{
	System.out.println("pure coconut oil");
	}
public static void main(String[] args) {
	oil o=()->{
		Lambda3 l1=new Lambda3();
		l1.purifiedoil();
	};
	o.purifiedoil();
}
}
