package innerClass; 

class A{
	
	private String name = "riya";
	public void display()
	{
		System.out.println("name is : "+name);
		
		class B{
			
			public void print() {
				System.out.println("inner local: " + name);
			}
		}
		
		B b = new B();
		b.print();
		
	}
	
}

public class localInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.display();

	}

}
