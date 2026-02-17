package testAbstraction;

interface Shape{
	
	public void draw();
	public void display();
	
	default void run() {
		System.out.println("default method ");
	}
}

class Circle implements Shape{
	
	public void draw() {
		System.out.println("Drawing circle");
	}
	public void display() {
		System.out.println("Printing Circle");
	}
	
	public void square() {
		System.out.println("drawing square");
	}
}

public class TestInterfaceAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s = new Circle();
		s.draw();
		s.display();
		s.run();
//		s.square(); 
//		can't execute this

		Circle c = new Circle();
		c.square();
	}

}
