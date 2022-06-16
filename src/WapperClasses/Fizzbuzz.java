package WapperClasses;

public class Fizzbuzz {
	public static void main(String[] args) {
		//	Write a JavaScript program that iterates the integers
		//
		//	from 1 to 100. But for multiples of three print "Fizz" instead
		//
		//	of the number and the multiples of five print "Buzz". For
		//
		//	numbers that are multiples of both three and five print
		//
		//	"FizzBuzz".

		for(int i=1;i<=100;i++)
		{

			if(i%3==0 && i%5==0) {
				System.out.println("Fizz+Buzz");
			}else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}else
			{
			System.out.println(i);
			}
		}
	}
}
