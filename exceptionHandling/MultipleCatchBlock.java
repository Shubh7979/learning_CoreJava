package exceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to exception");
		try {
			int a[]= new int[4];
			a[1] = 20/2;
			
			String n = null;
			System.out.println(n.length());
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("can't divisible by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("invalid array index");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
