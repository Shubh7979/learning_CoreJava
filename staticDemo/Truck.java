package staticDemo;
//instance initializer block
public class Truck {
	
	int speed;
	
	public Truck() {
		
		System.out.println("Speed of truck is: "+ speed);
		
		System.out.println("Constructor Executed...");
	}
	
	{
		speed = 80;
		System.out.println("Instance Initializer Bloock Executed...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck t = new Truck();

		
		
	}

}
