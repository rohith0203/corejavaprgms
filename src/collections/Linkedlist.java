package collections;
import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlist {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();//first listtttttttttttttttttttt
		l.add(1);
		l.add("hiii");
		l.add('h');
		l.add(null);
		l.add(1);
		l.add("zz");
		
		Iterator li=l.iterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("after modifyingggggggggggggggggggggggggggggggggggggg");
		LinkedList l2=new LinkedList();//second listttttttttttttttt
		l2.add("areyyy");
		l2.add(12);
		l.indexOf('h');//for to find the value where is present
		System.out.println("indxexxxx"+l.indexOf('h'));
		l.add(2,l2);
		Iterator li2=l.iterator();
		while(li2.hasNext())
		{
			System.out.println(li2.next());
		}
		
		
	}

}
