package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo {
	public static void main(String[] args) {
		ExecutorService service = Executors.newScheduledThreadPool(1);
		
		((ScheduledExecutorService) service).scheduleAtFixedRate(new ProbeTask(), 1000, 2000, TimeUnit.MILLISECONDS);
		
		try {
			if(!service.awaitTermination(10000, TimeUnit.MILLISECONDS)) {
				service.shutdownNow();
			}
		} catch (InterruptedException e) {
			service.shutdownNow();
		}
	}
}


class ProbeTask implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Probing end Points for updates...");
	}
}