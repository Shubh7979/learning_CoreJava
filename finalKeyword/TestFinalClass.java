package finalKeyword;

final class A {
	
	public void print() {
		System.out.println("parent final class called");
	}
}
// class final keyword can't inherit


//public class TestFinalClass extends A {
//
//	public void print1() {
//		System.out.println(" child final class called");
//	}
//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.print();
		
		TestFinalClass t = new TestFinalClass();
		t.print1();
	}

}
