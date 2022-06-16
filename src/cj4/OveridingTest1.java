package cj4;
interface x
{
	public void ex();
	public void xe();
}
class y implements x
{
	public void ex()
	{
		System.out.println("your ex is leaving");
	}
	public void xe()
	{
		System.out.println("new is comming");
	}
}
public class OveridingTest1 {
public static void main(String[] args) {
	x x2=new y();
	
	x2.ex();
	x2.xe();
}
}
