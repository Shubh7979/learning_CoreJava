package exceptionHandling;

public class ClassNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Class.forName("com.exam.test");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("class not found");
		}
	}

}
