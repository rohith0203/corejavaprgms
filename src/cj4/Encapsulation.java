package cj4;
import java.util.Scanner;
class account
{
	private int acc;
	private String branch;
	private double sal;
	
	public int getacc() {
		//System.out.println(acc);
		return acc;
	}
	
	public String getbranch(){
		return branch;
	}
	public double getsal()
	{
	return sal;
	}
	
	public void setacc(int acc)
	{
		this.acc=acc;
		
	}
	public void setbranch(String branch) {
		this.branch=branch;
	}
	public void setsal(double sal) {
		this.sal=sal;
	}
}

public class Encapsulation {
public static void main(String[] args) {
	account a1=new account();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter account Number");
	a1.setacc(sc.nextInt());
	System.out.println("Enter the branch");
	a1.setbranch(sc.next());
	System.out.println("Enter the salary");
	a1.setsal(sc.nextDouble());
	System.out.println("Details of the Branch");
}
}
