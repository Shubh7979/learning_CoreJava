package fileHandling;

public class TestIO {
	public static void main(String[] args) {
		
		System.out.println("Enter a character");
		
		
		
		
		try {
			int ch = System.in.read();
			System.out.println((char) ch);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.err.println("Test error System");
	}
}
