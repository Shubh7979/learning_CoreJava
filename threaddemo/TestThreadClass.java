package threaddemo;



public class TestThreadClass extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadClass t = new TestThreadClass();
		
		t.start();
	}

}
