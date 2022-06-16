package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
public static void main(String[] args) {
	LinkedList<String>s=new LinkedList<>();
	s.add("D");
	s.add("C");
	s.add("B");
	s.add("A");
	Iterator i=s.descendingIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
