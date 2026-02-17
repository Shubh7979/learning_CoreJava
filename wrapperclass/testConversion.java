package wrapperclass;

public class testConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "123";
		int a =Integer.parseInt(n);
		
		double d = Double.parseDouble(n);
		
		System.out.println(a);
		System.out.println(d);		
		int x =10;
		
		String s = Integer.toBinaryString(x);
		System.out.println(s);
	}

}
