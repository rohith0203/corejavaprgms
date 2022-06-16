package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class vehicle
{
	int price,rating;
	String name,model;
	public vehicle(String name,String model,int rating,int price)
	{
		this.name=name;
		this.model=model;
		this.rating=rating;
		this.price=price;
	}
	@Override
	public String toString() {
		return "vehicle [price=" + price + ", rating=" + rating + ", name=" + name + ", model=" + model + "]";
	}
	
}
public class Cars {
	public static void main(String[] args) {
		List<vehicle>l=new ArrayList<>();
		l.add(new vehicle("dugati","supura",9,100000));
		l.add(new vehicle("mustang","gora",8,10000));
		l.add(new vehicle("ferrari","bull",7,1000));
		l.add(new vehicle("getthereamazingly","top end",9,200000));
		l.add(new vehicle("alto","bs6",4,100000));
		//for String of name
		//List<vehicle>l1=l.stream().sorted((i1,i2)->i1.name.compareTo(i2.name)).collect(Collectors.toList());
		
		//for int of price
		//List<vehicle>l1=l.stream().sorted((i1,i2)->(i1.price>i2.price)?1:(i1.price<i2.price)?-1:0).collect(Collectors.toList());
		
		
		List<vehicle>l1=l.stream().filter(vehicle->vehicle.rating==9).collect(Collectors.toList());
		Set<vehicle>l2=new HashSet<>(l1);
		
		
		l2.forEach(vehicle->System.out.println(vehicle.name));
		l2.forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}
