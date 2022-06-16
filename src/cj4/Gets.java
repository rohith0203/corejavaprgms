package cj4;
 class  Gets1
{
private int id;
private String name;
private double sal;
public Gets1(int id,String name,double sal)
{
	this.id=id;
	this.name=name;
	this.sal=sal;
}
public String getname()
{
	return name;
}
	public  int getid()
	{
	return id;
	}
	public double getsal()
	{
		return sal;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setsal(double sal)
	{
		this.sal=sal;
	}
}

public class Gets {
	public static void main(String[] args) {
		Gets1 g=new Gets1(100,"komaaa",3000.0);
				System.out.println(g.getname());
		System.out.println(g.getid());
		System.out.println(g.getsal());
		
	}

}
