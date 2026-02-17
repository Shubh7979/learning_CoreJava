package innerClass;

interface animal{
	void dog();
	interface cat{
		public void sound();
	}
}

class pet implements animal.cat{
	public void sound() {
		System.out.println("meow");
	}
}

public class NestedInterface_ex1 implements animal{
	
	@Override
	public void dog() {
		// TODO Auto-generated method stub
		System.out.println("bark");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal.cat c = new pet();
		c.sound();
		

		NestedInterface_ex1 n = new NestedInterface_ex1();
		n.dog();

	}


}
