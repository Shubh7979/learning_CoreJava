package basicMultithreading;

public class JointhreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread one = new Thread(new Runnable () {

			@Override
			public void run() {
				for(int i = 0; i < 50;i++) {
					System.out.println("Thread 1: " + i);
				}
				
			}
			
		});
		
		Thread two = new Thread(new Runnable () {

			@Override
			public void run() {
				for(int i = 0; i < 25;i++) {
					System.out.println("Thread 2: " + i);
				}
				
			}
			
		});
		System.out.println("Before Executing the threads");
		one.start();
		two.start();
		one.join();
//		two.join();
		System.out.println("Done Executing the threads");


	}

}
