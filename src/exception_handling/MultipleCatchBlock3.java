package exception_handling;
public class MultipleCatchBlock3 {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[5]=30/0;
                System.out.println(a);
                int b[]=new int[5];
                System.out.println(b[10]);  
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
                           
               System.out.println("rest of the code");    
    }  
}  