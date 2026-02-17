package innerClass;

interface Greeting{
	public void sayHello();
}

public class TestAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greet = new Greeting() {
			public void sayHello() {
				System.out.println("Hello from Anonymous class");
			}
		};
		
		greet.sayHello();
		

	}

}
