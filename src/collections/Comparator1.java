package collections;
import java.util.*;
import java.util.Collections;
import java.util.TreeSet;

public class Comparator1 {
	public static void main(String[] args) {
		
		ArrayList<Integer>i=new ArrayList<Integer>();
		i.add(1);
		i.add(5);
		i.add(3);
		i.add(2);
		i.add(4);
		System.out.println(i);
	}

	public Object i;
	
}

class Comparator2 implements Comparator<Comparator1>
{
//Comparator1 c=new Comparator1();
	@Override
	public int compare(Comparator1 o1, Comparator1 o2) {
		// TODO Auto-generated method stub
		Comparator1 c1=(Comparator1)o1;
		Comparator1 c2=(Comparator1)o2;
		
		if(o1.i==o2.i)
		{
			return 1;
		}
		else 
		
		return -1;
	}

	
}

