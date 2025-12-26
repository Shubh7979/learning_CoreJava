package loops;

public class revNum {
	public static void main(String[]aargs) {
		int num = 1234,rem;
		
		while (num>0) {
			rem = num%10;
			num= num/10;
			System.out.println(rem);
		}
		
	}
}
