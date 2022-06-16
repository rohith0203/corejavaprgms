package exception_handling;

public class Custamise {
public static void main(String[] args) {
	String a="10";
	String b="0";
    if(a.equals(b))
    {
    	System.out.println("both are matching");
    }
    
    
    	
}
}
class RohithException1 extends RuntimeException
{

	@Override
	public String toString() 
	{
		return "dear rohith get Exception";
	}
	
}
