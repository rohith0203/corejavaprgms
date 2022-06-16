package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
public static void main(String[] args) {
	TreeMap<Integer,String>t=new TreeMap<Integer,String>();
	t.put(10, "A");
	t.put(2, "A");
	t.put(5, "C");
	t.put(4, "B");
	for(Map.Entry t1:t.entrySet())
	{
		System.out.println(t1.getKey()+" "+t1.getValue());
	}
	
}
}
