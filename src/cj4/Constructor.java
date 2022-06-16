package cj4;

public class Constructor
{
public static void main(String[] args) {
	
	hid c1=new hid("komaa",22,true);
	hid c2=new hid("astrok",21,false);
	c1.Constructor1();
	c2.Constructor1();
}
}
class hid
{
	public String s;
	public int i;
	public boolean c;
	public hid(String s,int i,boolean c)
	{
		this.s=s;
		this.i=i;
		this.c=c;
	}
	
	public void Constructor1()
	{
		System.out.println(s+i+c);
		System.out.println(s);
		System.out.println(i);
	}
}
	