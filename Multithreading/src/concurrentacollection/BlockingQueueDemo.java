package concurrentacollection;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
	
	private final static int QUEUE_CAPACITY =  10;
	static BlockingQueue<Integer> taskQueue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);
	
	
	public static void main(String[] args) {
		
		Thread producer = new Thread (() -> {
			try {
				for(int i = 1;i <=20;i++ ) {
					taskQueue.put(i);
					Thread.sleep(100);
					System.out.println("Task Produced : " + i);
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		});
		
		Thread consumerOne = new Thread(() ->{
			try {
				while(true) {
					int task = taskQueue.take();
					processTask(task, "ConsumerOne");
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		});
		
		
		Thread consumerTwo = new Thread(() -> {
			try {
				while(true) {
					int task = taskQueue.take();
					processTask(task, "ConsumerTwo");
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		});
		
		producer.start();
		consumerOne.start();
		consumerTwo.start();
		
	}


	private static void processTask(int task, String consumerName) throws InterruptedException {
			System.out.println("Task being Processed by " + consumerName + " : " + task);
			Thread.sleep(1000);
			System.out.println("Task consumed by " + consumerName + " : " + task);
		}

}
