package loops;

public class pattern4 {
	public static void main(String[]args) {
		int rows = 7;
		
		for (int i = 0;i<rows;i++) {
			
			for(int k =0;k<i;k++) {
				System.out.print(" ");
			}
			
			for(int j = rows-i;j>0;j-- ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
