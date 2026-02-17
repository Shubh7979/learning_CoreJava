package basicMultithreading;

public class ThreadPriorityExample {

	public static void main(String[] args) {
		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(10);
//		System.out.println(Thread.currentThread().getPriority());
//		
		System.out.println(Thread.currentThread().getName() + " says HI!!!");
		
		Thread one = new Thread(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("THread one says HI as well");
				
			}
			
		});
		
		one.setPriority(Thread.MAX_PRIORITY);
		one.start();
	}

}
