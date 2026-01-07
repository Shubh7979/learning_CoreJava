package exceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thank you");
		try {
			int a[] = new int[5];
			try {
				a[0]=30/5;
			} catch (ArithmeticException e) {
				System.out.println("cannot divisible by zero");
			}
			String n = null;
			System.out.println(n.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
