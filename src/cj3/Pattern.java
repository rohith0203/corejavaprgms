package cj3;
import java.util.Scanner;
public class Pattern {
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row number");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=n;c>=r;c--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
}
}

