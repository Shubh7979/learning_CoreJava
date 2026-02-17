package innerClass;

class Outerclass{
	int x = 100;
	
	class Innerclass{
		public void innerMethod() {
			System.out.println("value from outer class: "+ x);
		}
	}
}

public class testMemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outerclass oc = new Outerclass();
		
		// upcasting
		Outerclass.Innerclass inner = oc.new Innerclass();
		
		inner.innerMethod();
	}

}
