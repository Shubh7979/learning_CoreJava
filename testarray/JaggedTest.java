package testarray;

public class JaggedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jaggedArr[][]= { {2, 6, 7, 5} , {5,7,6,9},{}};

		for(int i = 0;i<jaggedArr.length;i++) {
			
			for(int j = 0;j<jaggedArr[i].length;j++) {
				System.out.print(jaggedArr[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
