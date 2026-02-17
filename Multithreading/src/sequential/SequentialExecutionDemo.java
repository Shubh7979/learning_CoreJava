package sequential;

public class SequentialExecutionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();
		demo2();
		
		
	}
		
	private static void demo1() {
			for(int i = 0; i<5; i++) {
				System.out.println("for demo 1: " + i);
			}
	}

	private static void demo2() {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++) {
			System.out.println("for demo 2: " + i);
		}
	}
	
	
	}


