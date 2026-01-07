package exceptionHandling;

public class DemoThrowThrows {
	
	static void withdraw (int balance, int amount) throws Exception {
		
		if(amount>balance) {
			throw new Exception("Insufficient balance");
		}
		System.out.println("please collect your cash");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			withdraw(5000,7000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("transaction failed: " + e.getMessage());
			System.out.println(e);
		}
		
	}

}
