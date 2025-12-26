package conditionalStatement;

import java.util.Scanner;
public class trafficLight {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a color from [RED | GREEN | YELLOW] : ");
		String color = sc.next();
		
		if(color.equals("red")) {
			System.out.println("STOP");
		}
		else if (color.equals("green")) {
			System.out.println("GO NOW");
		}
		else if (color.equals("yellow")) {
			System.out.println("GET READY TO GO");
		}
	}
}
