package exception_handling;

public class Demo {

	public static void main(String[] args) {
		
		try {
			
			int a = 10 / 0;
			System.out.println(a);
		int b[]=new int[3];
		System.out.println(b[44]);
		}

		catch (ArithmeticException ex) {
			System.out.println("areyyyy");
		}

	}

}
