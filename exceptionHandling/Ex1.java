package exceptionHandling;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data = 100/0;
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("rest of the code");
		}
	}

}
