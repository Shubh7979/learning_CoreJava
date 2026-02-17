package innerClass;

class Demo{

	public Demo() {
		
		System.out.println("Inside demo constructor");
		
		class inner{
			public void show() {
				
				System.out.println("Hello from Local Inner Class");
				
			}
		}
		
		inner i = new inner();
		i.show();
		
	}
}

public class InConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d = new Demo();
		//constructor gets called at time of object creation
	}

}
