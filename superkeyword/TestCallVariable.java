package superkeyword;

class A{
	int age ;
	String name;
	
	public void show() {
		System.out.println("Print Age: "+ age);
		System.out.println("Print name: "+ name);
	}
}

public class TestCallVariable {
	
	public static void main(String[]Args) {
		
		A a1 = new A();
		a1.show();
		
		a1.age = 100;
		System.out.println(a1.age);
		
		
		a1.name = "riya";
		System.out.println(a1.name);
		
		a1.show(); //values should be given before call
		
	}

}
