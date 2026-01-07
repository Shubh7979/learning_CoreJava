package exceptionHandling;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			int a= 10, b=0;
			System.out.println("Welcome to exception Handling");
			System.out.println("Result of Addition : " + (a+b));
			
			System.out.println("Result of Division : " + (a/b));

		}
		catch(Exception e)
		{
			System.out.println("can not divisible by 0");
		}
		System.out.println("Rest of code");
	}

}
