package collections;
import java.util.Vector;
public class Vector12 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(1);
	v.add("jai balaya");
	v.add(23.6);
	v.add(true);
	v.add(null);
	System.out.println(v);
	v.remove(true);
	System.out.println("after remove"+v);
	v.set(0, "heyyyy");
System.out.println("after set"+v);

System.out.println("contains"+v.contains("jai balaya"));
v.get(3);
System.out.println(v.get(3));
}
}
