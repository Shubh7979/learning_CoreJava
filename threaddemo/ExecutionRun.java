package threaddemo;

import java.util.Iterator;

public class ExecutionRun extends Thread{
	
	public void run() {
		for(int i = 0;i<50;i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ExecutionRun e1 = new ExecutionRun();
		
		ExecutionRun e2 = new ExecutionRun();
		
		e1.run();
		e2.run();

	}

}
