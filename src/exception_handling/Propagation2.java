package exception_handling;

public class Propagation2 {

	 void m() 
	 {  
		    int data=50/0;  
		    System.out.println(data);
		  }  
		  void n()
		  {  
		    m();  
		  }  
		  void p()
		  {  
		   try
		   {  
		    n();  
		   }
		   catch(ArithmeticException a)
		   
		   {
			   System.out.println("exception handled");}  
		   }  
		  public static void main(String args[]){  
		  Propagation2 obj=new Propagation2();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
	
}
