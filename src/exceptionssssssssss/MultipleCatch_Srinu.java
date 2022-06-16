package exceptionssssssssss;

import java.io.FileNotFoundException;
import java.io.IOException;



public class MultipleCatch_Srinu {
	public static void main(String[] args) {
		
	
int i=500;
int j=0;
	String s="sap";
			System.out.println("main starts");
			try
			{
				System.out.println(s.charAt(3));/*in multiple stmts its only check the 1 condition if the fst condition got the answer they didnt go for the next stmt*/
				System.out.println(i/j);
			}
			catch(NullPointerException e)
			{
				System.out.println("enter the value other than zero");
			}
			
			catch(Exception e)
			{
				System.out.println("check carefully");
			}
			
	}
}
