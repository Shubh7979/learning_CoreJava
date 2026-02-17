package threaddemo;

public class ThreadName extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Thread Executing..."+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadName t1 = new ThreadName();
		ThreadName t2 = new ThreadName();
		ThreadName t3 = new ThreadName();
		
		System.out.println("Name of Thread t1: " + t1.getName());
		System.out.println("Name of Thread t2: " + t2.getName());
		System.out.println("Name of Thread t2: " + t3.getName());
		

		
		t1.setName("Shubham");
		System.out.println("Name of Thread t1: " + t1.getName());

		t1.start();
		t2.start();
		t3.start();
	}

}
