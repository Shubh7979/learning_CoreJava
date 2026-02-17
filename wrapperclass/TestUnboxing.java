package wrapperclass;

public class TestUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d1 = 50.00;
		
		double d = d1;
		System.out.println("d is : "+d);
	
		Double d2 = 60.00;
		double obj = d2.doubleValue();
		
		System.out.println("object is: "+ obj);
		
		float f= 12;
		Float f1 = f;
		float f3 = f1;
		
		System.out.println("f3 is "+ f3);
		float f4 = f1.floatValue();
		
		System.out.println("f4 is "+ f4);
		
		String s = "123";
		Integer a = Integer.parseInt(s);
		System.out.println(a);
		int b = 456;
		int c = a+b;
		System.out.println(c);
	}

}
