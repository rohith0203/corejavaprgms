package tsak;

public class FizzBuzz {

	public static void main(String[] args) {
		int i,n=100;
		for(i=1;i<=n;i++)
		{
			if(i%5==0&&i%3==0)
			{
				System.out.println("fizzBuzz");
			}
			else if(i%5==0)
			{
				System.out.println("buzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
