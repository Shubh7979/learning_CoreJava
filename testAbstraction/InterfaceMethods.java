package testAbstraction;

interface MyInterface{
	static void testStatic() {
		System.out.println("Static method called");
	}
	
	private void testPrivate() {
		System.out.println("Private method called");
	}
	
	default void testDefault() {
		
		testStatic();
		testPrivate();
		// can call using default
		System.out.println("Default method called");
	}
	
	public void display();
	
}

class MyClass implements MyInterface{
	public void display() {
		System.out.println("display method called");
	}
}

public class InterfaceMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface m = new MyClass();
		m.display();
		m.testDefault();
//		m.testPrivate();
//		m.testStatic();
		
		// can't call Private OR Static method
	}

}
