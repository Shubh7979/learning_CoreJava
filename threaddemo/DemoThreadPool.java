package threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{

	private String message;
	
	public WorkerThread(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + "(start) message " + message);
		
		processmessage();
		System.out.println(Thread.currentThread().getName() + "(end)");
		
	}
	
	private void processmessage() {
		
		try {
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
	}
	
	
}

public class DemoThreadPool {
	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newFixedThreadPool(5);
		
		for(int i = 1;i<=10;i++) {
			Runnable worker = new WorkerThread(" "+i);
			exec.execute(worker);
		}
		
		exec.shutdown();
		
//		while(!exec.isTerminated()) {
//			
//			System.out.println("pool terminated");
//		}
	}
}
