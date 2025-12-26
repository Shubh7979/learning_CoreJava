package finalKeyword;

final class MathOperation{
	
	static int add(int a,int b) {
		return a+b;
	}
	
	static int sub(int a, int b) {
		return a-b;
	}
	
	
}

public class DemoFinalClass extends MathOperation  // class final doesn't allow extend and inheritance
{
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperation m = new MathOperation();
		System.out.println(m.add(50, 11));
		System.out.println(m.sub(50, 11));

		
	}

}
