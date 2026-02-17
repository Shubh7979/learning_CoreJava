package basicMultithreading;

public class WaitAndNotifyDemo {
	
	private static final Object Lock = new Object();
	
	public static void main(String[] args) {
		
		Thread one = new Thread(() -> {
			
			try {
				one();
			} catch (InterruptedException e) {
				
				throw new RuntimeException(e);
			}
			
		});
		
		Thread two = new Thread(() -> {
			
			try {
				
				two();
				
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			
		});
		
		one.start();
		two.start();
		
		
	}
	
	public static void one() throws InterruptedException{
		
		synchronized(Lock) {
			System.out.println("Hello from method one...");
			Lock.wait();
			System.out.println("again in method one");
		}
	}
	
	
	public static void two() throws InterruptedException{
		
		synchronized(Lock) {
			System.out.println("Hello from method two...");
			Lock.notify();
			System.out.println("again in method two");
		}
	}
}
