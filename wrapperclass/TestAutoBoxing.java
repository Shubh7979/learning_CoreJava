package wrapperclass;



public class TestAutoBoxing {

	public static void main(String[] args) {

		//Autoboxing = from primitive to object class wrapper
		
		int a = 10;
		Integer b = a;
		
		System.out.println(b);
		
		int x = 20;
		Integer y = Integer.valueOf(x);
		
		System.out.println("y is: "+ y);
	}

}
