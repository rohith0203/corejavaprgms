package tsak;

import java.util.Arrays;

public class Pratice
{
	public static void main(String[] args)
	{

		String a="hello";
		String b="hi";
		if(a.equals(b))
		{
			System.out.println("both are equal");
		}
		else
		{
			throw new RohithException();
		}
	}
}
class RohithException extends RuntimeException
{

	@Override
	public String toString() {
		return "Rohith u got an Exception";
	}
	
}