package Strings;

public class StringBuilder1 {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("hello");
	sb.append("java");
	System.out.println(sb);
	StringBuilder sb1=new StringBuilder("hello");
	sb1.insert(2,"koma");
	
	System.out.println(sb1);
	StringBuilder sb2=new StringBuilder("hello");
	sb2.replace(1,2,"koma");
	System.out.println(sb2);
	StringBuilder sb3=new StringBuilder("hello");
	sb3.reverse();
	System.out.println(sb3);
}
}
