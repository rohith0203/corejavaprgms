package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(0);
		list.add(14);
		list.add(3);
		list.add(3);
	System.out.println(list);
		List<Integer>list1=list.stream().filter(i->i>0).collect(Collectors.toList());//to filter the elements 
		System.out.println(list1);
		
		List<Integer>list2=list.stream().map(m->m+5).collect(Collectors.toList());// to replace the all elements
		System.out.println(list2);
		 long list3=list.stream().filter(f->f>0).count();
		 System.out.println("count="+list3);
		list2.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
	}

}
