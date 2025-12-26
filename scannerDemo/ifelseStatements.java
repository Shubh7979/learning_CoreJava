package scannerDemo;

import java.util.Scanner;

public class ifelseStatements {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		if (age>=19) {
			System.out.println("You are an adult!!");
		}
		else if(age <19 & age>16 ) {
			System.out.println("You are a teenager");
		}
		else if(age > 75 ) {
			System.out.println("You are a Boomer");
		}
		else {
			System.out.println("You are a child!!");
		}
	}

}
