
package exception_handling;
class Exception{
     
    public static void main(String[] args)
    {
         int a=10;
         int b=0;
        String str = "Agams";
        try {
        System.out.println(a/b);
        System.out.println(str.charAt(30));
        }
       
        catch(ArithmeticException e)
        {
        	System.out.println("ENTER the correct value");
        }
        catch(StringIndexOutOfBoundsException e)
        {
        	System.out.println("exceptiion occured");
        }
       
}
}