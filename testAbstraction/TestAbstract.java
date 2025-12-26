package testAbstraction;

abstract class Vehicle{
	
	abstract void run();
	abstract void show();
	
	public void display() {
		System.out.println("non abstract method");
	}
}

class Car extends Vehicle{
	
	 
	public void run() {
		System.out.println("Car is running");
		
	}
	
	public void show() {
		
	}
}

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Car();
		v.run();
		v.display();
	}

}
