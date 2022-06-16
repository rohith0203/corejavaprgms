package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Lover
{
	int lovers;
  String LoverName,bike;
  int money;
  public Lover(int lovers,String lovername,String bike,int money)
  {
	  this.lovers=lovers;
	  this.LoverName=LoverName;
	  this.bike=bike;
	  this.money=money;
  }
@Override
public String toString() {
	return ")lovers=" + lovers + ", LoverName=" + LoverName + ", bike=" + bike + ", money=" + money;
}
  
}
public class TreeMap2 {
public static void main(String[] args) {
	TreeMap<Integer,Lover>t=new TreeMap();
	t.put(1,new Lover(0,"null","Rx 100",30000));
	t.put(2,new Lover(1,"shekila","Bullet",40000));
	t.put(3,new Lover(3,"Harshini","Pulsar 150",20000));
	
	for(Entry<Integer,Lover>f:t.entrySet())
	{
		System.out.println(f);
	}
}
}
