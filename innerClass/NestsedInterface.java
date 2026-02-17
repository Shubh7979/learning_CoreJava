package innerClass;

class AOuter{
	interface Showable{
		public void show();
	}
}

class AClass implements AOuter.Showable{
	public void show () {
		System.out.println("Nested Interface");
	}
}

public class NestsedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting
		AOuter.Showable s1 = new AClass();
		s1.show();
	}

}
