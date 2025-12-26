package superkeyword;

class Vehicle {
	
	public Vehicle(int x) {

		System.out.println("parent class constructor  "+ x);
	}
}

class Car extends Vehicle{
	
	public Car() {
		super(10);
		System.out.println("child class constructor");
	}
}

public class callParentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		
	}

}
