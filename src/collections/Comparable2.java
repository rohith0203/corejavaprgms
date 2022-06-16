package collections;
import java.util.*;
import java.util.Collection;
import java.util.LinkedList;

class Wwe implements Comparable<Wwe>
{
	int rank;
	String name,title;
	public Wwe(int rank,String name,String title)
	{
		this.rank=rank;
		this.name=name;
		this.title=title;
	}
	
	/*@Override
	public String toString() {
		return "Wwe [rank=" + rank + ", name=" + name + ", title=" + title + "]";
	}*/

	public int  compareTo(Wwe w)
	{
		if(rank==w.rank)
		{
			return 1 ;
		}
		else if(rank>w.rank)
		{
			return 0;
		}
		else return -1;
	}
}
public class Comparable2 {
public static void main(String[] args) {
	LinkedList<Wwe> L=new LinkedList<Wwe>();
	L.add(new Wwe(3,"john cena","world heavy weight champion"));
	L.add(new Wwe(2,"usos","tag team champion"));
    L.add(new Wwe(1,"Brock lesner","world heavy weight champion"));
    Collections.sort(L);

for(Wwe ans:L)
{
	System.out.println(ans.rank+"  "+ans.name+" "+ans.title);
	//System.out.println(An);
}


}
}
