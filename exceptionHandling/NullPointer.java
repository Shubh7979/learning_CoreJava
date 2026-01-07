package exceptionHandling;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
			String a=null;
		
			System.out.println("length : " + a.length());
		}
		catch(Exception e) {
			System.out.println("Null Pointer Exception");
		}
	}

}
