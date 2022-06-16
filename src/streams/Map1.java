package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Credit {
	public static final String Credit = null;
	String name, area;
	int amount, date;

	public Credit(int date, String name, int amount, String area) {
		this.date = date;
		this.name = name;
		this.amount = amount;

		this.area = area;
	}

	public int getDate() {
		return date;
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "name :" + name + ", date :" + date + ",amount :" + amount + " ,area" + area + "\n";
	}

}

public class Map1 {
	public static void main(String[] args) {
		List<Credit> l = new ArrayList<Credit>();
		l.add(new Credit(12, "rohith", 20000, "balanagar"));
		l.add(new Credit(2, "srinuu", 10000, "anna nagar"));

		l.add(new Credit(6, "devi", 3000, "puri nagar"));
		l.add(new Credit(1, "charan", 200, "banga agar"));
		Map l1 = l.stream().sorted((i1, i2) -> i1.name.compareTo(i2.name))
				.collect(Collectors.toMap(x -> x.amount, x -> x));
//	System.out.println(l1);
//	l1.forEach((a,b) -> System.out.println(a +" -> "+b));
		l.forEach(f -> System.out.println(f));


	}
}
