package collections;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
public class Arraylist1 {
public static void main(String[] args) {
	
	ArrayList a=new ArrayList();
	a.add("ramulu");
     a.add(null);
     a.add(23456);
     a.add('k');
     a.add("yasta");
ArrayList set=new ArrayList();
set.add("hi");
set.add("bye");
a.remove(1);
a.addAll(1,set);
Iterator i= a.iterator();  
while(i.hasNext())
{
System.out.println(i.next());
}
}
}
