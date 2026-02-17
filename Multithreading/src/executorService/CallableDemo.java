package executorService;

import java.util.concurrent.*;

public class CallableDemo {

	public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException{
		
		try(ExecutorService executorService = Executors.newFixedThreadPool(2)){
			Future<Integer> result = executorService.submit(new ReturnValue());
			
			
		//	result.cancel(false);
			System.out.println(result.isCancelled());
			
			result.isCancelled();
			System.out.println(result.isDone());
			
			try {
				System.out.println(result.get(6, TimeUnit.SECONDS));
				
				//here we are limiting timeout to 1 second => exception
				// if we increase the timeout to a higher value then it gets executed properly
				
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Main Thread execution completed");
			
			System.out.println(result.isDone());
		}
		
		

	}

}

class ReturnValue implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		return 79;
	}
	
}
