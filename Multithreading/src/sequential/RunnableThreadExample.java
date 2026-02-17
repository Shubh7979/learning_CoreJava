package sequential;

public class RunnableThreadExample {
	
	public static void main(String[] args) {
		
		Thread one = new Thread(new ThreadOne());
		
		Thread two = new Thread(new ThreadTwo());
		
		Thread three = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0;i < 15;i++) {
					System.out.println("Thread three: " + i);
				}
				
			}
		});
		
		one.start();
		two.start();
		three.start();
	}

}

class ThreadOne implements Runnable{

	@Override
	public void run() {
		
		for(int i = 1 ; i < 15;i++) {
			System.out.println("Thread 1: "+i);
		}
		
	}
	
	
}

class ThreadTwo implements Runnable{

	@Override
	public void run() {
		
		for(int i = 1 ; i < 15;i++) {
			System.out.println("Thread 2: "+i);
		}
		
	}
	
	
}
