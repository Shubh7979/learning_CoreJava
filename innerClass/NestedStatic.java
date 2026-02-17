package innerClass;

import innerClass.OuterClass1.testNestedStatic;

class OuterClass1{
	
	static String msg = "Hello from Nested Static";
	
	static class testNestedStatic{
		public void name() {
			System.out.println("message: " + msg);
		}
		
		static void game() {
			System.out.println("this is static method within static class ");
		}
	}
}

public class NestedStatic {

	public static void main(String[] args) {
		
		OuterClass1.testNestedStatic test = new OuterClass1.testNestedStatic();
		test.name();
		
		testNestedStatic.game();
		
		OuterClass1.testNestedStatic.game();
	}
	

}
