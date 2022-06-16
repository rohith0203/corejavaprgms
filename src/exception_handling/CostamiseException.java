package exception_handling;
public class CostamiseException {

	public static void main(String[] args)
	{
		String name="rohith";
		String name2="rohithww";
		
		if(name.equals(name2))
		{
			System.out.println("both are macthed");
		}
		else
			throw new RohithException();
	}
}
class RohithException extends RuntimeException
{
	public String toString()
	{
		return "Rohith u have a exeception";
	}
}
