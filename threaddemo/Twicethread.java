package threaddemo;

public class Twicethread extends Thread{
	
	
		public void run() {
			System.out.println("Thread Exception");
		}
	

	public static void main(String[] args) {
		
		Twicethread t = new Twicethread();
		
		t.run();
		t.run();
		
		//multile start of same threaed cause excepton
		t.start();
		t.start();

	}

}
