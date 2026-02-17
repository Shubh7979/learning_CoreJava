package basicMultithreading;

public class SynchronisationDemo {
	
	private static int counter = 0; 

	public static void main(String[] args) {
		
		Thread one = new Thread (() -> {
			for (int i = 0;i<10000;i++) {
				increment();
			}
		});
		
		Thread two = new Thread (() -> {
			for (int i = 0;i<10000;i++) {
				increment();
			}
		});
		
		
		
		one.start();
		two.start();
		
		try {
			one.join();
			two.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Counter Value: "+counter);
		
		
		
		/* 
		 1. Load 
		 2. Increment
		 3. Set back the value
		 counter= 0 then thread 1 sees and increments
		 counter= 0 then thread 2 sees and increments
		 but thread 2 intercepted 1 without completing task
		  */ 
	}
	
	private synchronized static void increment(){
		counter++;
	}

}
