package fileHandling;

import java.util.Scanner;

public class TestHasNext {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner("hello, welcome to class");

		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
}