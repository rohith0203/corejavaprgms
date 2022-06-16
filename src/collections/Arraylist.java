package collections;
import java.util.ArrayList;
public class Arraylist {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(40);
	a1.add("pushpa");
	a1.add(20);
	a1.add(true);
	a1.add('c');
	a1.add(null);
	System.out.println("my arraylist elements are");
	System.out.println(a1);
	System.out.println("for searching"+a1.contains("pushpa"));
	System.out.println("for fenching"+a1.get(5));
	a1.set(6,90);
	System.out.println("newly modified list is"+a1);
	a1.set(2,"kattapa");
	a1.remove(6);
	System.out.println(a1);
	
}
}
