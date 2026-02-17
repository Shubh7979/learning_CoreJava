package threaddemo;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}
	
}

public class UsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		
		Thread t2 = new Thread(t1);
		
		t2.start();
	}

}


