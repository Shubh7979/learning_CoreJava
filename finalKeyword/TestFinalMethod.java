package finalKeyword;

class FinalTest
{
	final void display() {
		System.out.println("Final Method");
	}
}

public class TestFinalMethod extends FinalTest {

	public void display1() {
		System.out.println("Child Class final Method");
	}
	public static void main(String[]args) {
		FinalTest f = new FinalTest();
		f.display();
		
		TestFinalMethod t = new TestFinalMethod();
		t.display1();
	}
}
