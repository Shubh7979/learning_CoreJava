package innerClass;


class outer{
	
	int data = 30;
	
	class inner{
		
		public void printdata() {
			System.out.println("Data is : " + data);
		}
	}
}

public class memberInner_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer outObj = new outer();
		outer.inner inObj = outObj.new inner();
		
		outObj.data = 50;
		
		inObj.printdata();
	}

}
