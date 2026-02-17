package innerClass;

 class Test{
	public void sayHello() {
		System.out.println("Hello");
	}
}

public class AnonymousInMethod{
	public void show() {
		
		Test t = new Test() {
			public void sayHello() {
				System.out.println("Hello from Anonymous Method");
			}
		};
		t.sayHello();
		
	}

	public static void main(String[] args) {
		AnonymousInMethod a = new AnonymousInMethod();
		a.show();
	}

}
