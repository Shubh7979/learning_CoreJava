package exceptionHandling;

public class TestThrowKeyword {
	
	public static void validate(int age){
		
		if(age<18) {
			
			throw new ArithmeticException("The person is not allowed to vote");
			
		}
		else {
			System.out.println("valid voting age");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			validate(19);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of code");
	}

}
