package exceptionHandling;

class PasswordException extends Exception{
	
	public PasswordException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}

class passwordDemo{
	static void CheckPassword(String password) throws PasswordException{
		
		if(!password.equals("abcdef1212")) {
			throw new PasswordException("Invalid password");
		}else {
			
			System.out.println("correct Password");
		}
	}
}

public class InvalidPasswordException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			passwordDemo.CheckPassword("abcdef1212");

			
		} catch (PasswordException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("\nrest of code");
		}
	}

}
