package fileHandling;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a name: ");
		String msg = sc.next();
		
		System.out.println("HEllO " + msg);
		
		System.out.println("Enter a message: ");
		String msg1 = sc.nextLine();
		
		System.out.println("your message is " + msg);
		sc.close();

	}

}
