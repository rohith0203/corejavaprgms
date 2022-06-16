package exceptionssssssssss;


public class Propagation {
   
	 public void m()
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
		   try{  
		    n();  
		   }catch(Exception a)
		   {System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		  Propagation obj=new Propagation();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  } 
}
