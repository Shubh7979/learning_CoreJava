package exceptionHandling;

import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		
		//Multiple exceptions
		
		try {
			int data = 100/2;
			System.out.println(data);
			int a[] = {10,20,30,40,50,60}; 
			System.out.println(a[5]);
			
			
			String str = "abc";
			int num = Integer.parseInt(str);
			System.out.println(num);
			
			String S = null;
			System.out.println(S.length());
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}

	}

}
