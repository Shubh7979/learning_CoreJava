package conditionalStatement;

import java.util.Scanner;

public class electricityBill {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your used units: ");
		int units = sc.nextInt();
		
		if (units < 100) {
			System.out.println("Your consumption is LOW ");
		}
		if (units < 300 && units >100) {
			System.out.println("Your consumption is MEDIUM ");
		}
		if (units > 300) {
			System.out.println("Your consumption is HIGH ");
		}
	}
}
