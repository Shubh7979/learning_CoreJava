package finalKeyword;

public class TestFinalKeyword {
	
	static int a=20;
	
	final static int b = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.println(b);
		
		a= 40;
//		b= 100;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
