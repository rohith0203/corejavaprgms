package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedStream {
public static void main(String[] args) {
	List<Integer>l1=new ArrayList<Integer>();
	l1.add(12);
	l1.add(2);
	l1.add(16);
	l1.add(32);
	l1.add(2);
	System.out.println(l1);
	List<Integer>l2=l1.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
	l2.forEach(System.out::println);
	/////////////////converting list to set /////////////////////////////////
	System.out.println("aftre hashset ");
	Set<Integer>l3=new LinkedHashSet<Integer>(l2);
	l3.forEach(System.out::println);
	/////////////////////////////////////////////////////////////////////////
	
}
}
