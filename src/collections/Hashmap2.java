package collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
	public static void main(String args[]){  
		   HashMap<Integer,String>a=new HashMap<Integer,String>();
		   a.put(1,"A");
		   a.put(2,"A");
		   a.put(1,"C");
		   for(Map.Entry m:a.entrySet())
		   {
			   System.out.println(m.getKey()+"="
			   		+ ""+m.getValue());
		   }
		   HashMap<Integer,String>b=new HashMap<>();
		   b.put(1,"B");
		   b.put(2,"D");
		   b.put(3,"E");
		   
		   a.putAll(b);
		   for(Map.Entry n:a.entrySet())
		   {
			 System.out.println(n.getKey()+"="+n.getValue());  
		   }
		   
		   
		   
}
}