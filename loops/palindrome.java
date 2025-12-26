package loops;
import java.util.Scanner;

public class palindrome {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rev= 0;
		int temp = num;
		
		while(num>0) {
			int rem = num%10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		System.out.println("reverse: " + rev);
		if (temp == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
