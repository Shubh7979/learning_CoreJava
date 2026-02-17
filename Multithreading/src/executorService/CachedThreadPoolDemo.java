package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

	public static void main(String[] args) {
		
		
		
		try {
			ExecutorService service = Executors.newCachedThreadPool();
			for(int i = 0;i<1000;i++) {
				service.execute(new TaskOne(i));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

class TaskOne implements Runnable{
	
	private final int TaskId;
	
	public TaskOne(int TaskId) {
		this.TaskId = TaskId;
	}

	@Override
	public void run() {
		System.out.println("Task: " + TaskId + " Executed by " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);

		}
			
	}
	
}
