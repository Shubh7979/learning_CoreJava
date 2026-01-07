package exceptionHandling;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String a = "Java";
			System.out.println("print the character :"+a.charAt(5));
		}
		catch(Exception e) {
			System.out.println("invalid string index");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

}
