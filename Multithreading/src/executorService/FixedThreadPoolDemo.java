package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

	public static void main(String[] args) {
		
		try {
			ExecutorService service = Executors.newFixedThreadPool(3);
			
			for(int i = 0; i<7 ;i++) {
				service.execute(new work(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

class work implements Runnable{
	
	public final int workId;
	
	public work(int workId) {
		this.workId = workId;
	}

	@Override
	public void run() {
		
		System.out.println("Task ID " + workId + " being executed by " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
