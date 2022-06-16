package cj4;

class valid
{
	private int monthno;
	public int getmonthno()
	{
		return monthno;
	}
	public void setmonthno(int monthno)
	{
		this.monthno=monthno;
		if(monthno<=12)
		{
			System.out.println("month no is "+monthno);
		}else {
			System.out.println("invalid data");
		}
	}
}
public class Encapsulation2 {
	public static void main(String[] args) {
		valid v=new valid();
		v.setmonthno(11);
	}

}
