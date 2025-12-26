package loops;

public class fibonacci {
	public static void main(String[]args) {
 		int first = 0,second= 1;
		for (int i=2; i<=10;i++) {
			int next = first + second;
			
			first = second ;
			second = next;
			
			System.out.println(next);
		}
		
	}
}
