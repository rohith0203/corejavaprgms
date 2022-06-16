package java8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Cars implements Comparable<Cars>
{
        String name,brand;
        int price;

	public Cars(String name,String brand,int price)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Cars [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}



	@Override
	public int compareTo(Cars o) {
		
		return this.name.compareTo(o.getName());
	}
	
	
	
	
	
}
public class Lambda2 {
public static void main(String[] args) {
	Set<Cars> w = new TreeSet();

	w.add( new Cars("Ferari","A",2444));
	w.add( new Cars("OOO","B",1444));
	w.add( new Cars("Benz","C",4444));
	
	
	 for(Cars z:w) { System.out.println(z.name+" "+z.brand+" "+z.price); }
	 
}

}
