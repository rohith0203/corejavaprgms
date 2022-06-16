package collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
	public static void main(String args[]){  
		   HashMap<String,Integer> ap=new HashMap<>();//Creating HashMap    
		   ap.put("Mango",1);  //Put elements in Map  
		   ap.put("Apple",2);    
		   ap.put("Banana",3);   
		   ap.put("Grapes",4);   
		       
		   System.out.println("Iterating Hashmap...");  
//		   for(Map.Entry m:ap.entrySet())
//		   {
//			   System.out.println(m.getKey()+"="+m.getValue());
//		   
//			   
//		   }  
		   
		   for(Map.Entry m:ap.entrySet())
		   {
			   System.out.println(m.getKey());
		   }
		   
		   
		   
		   
		   
		}  
}
