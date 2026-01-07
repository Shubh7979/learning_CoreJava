package exceptionHandling;

class ShubhamException extends Exception{
	
	public ShubhamException(String msg) {
		
		super(msg);
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new ShubhamException("own Exception");
		} catch (ShubhamException e) {
			System.out.println(e);
		}
	}

}
