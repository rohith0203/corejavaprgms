package collections;
import java.util.*;
public class Treeset  {

	public static void main(String[] args) {
		TreeSet<Integer>i=new TreeSet<Integer>(new MyComparator());
		i.add(1);
		i.add(5);
		i.add(3);
		i.add(2);
		i.add(4);
		System.out.println(i);
	}
	
}
class MyComparator implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		Integer i1=(Integer)ob1;
		Integer i2=(Integer)ob2;
		return i1.compareTo(i2);
	}
	
}