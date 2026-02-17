package threaddemo;

public class ThreadLifeCycle extends Thread{
	
	public void run() {
		
		System.out.println("Running State: "+ Thread.currentThread().getState());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadLifeCycle t = new ThreadLifeCycle();

		System.out.println("born state: "+t.getState());
		
		t.start();
		System.out.println("ready to execute state: "+t.getState());

		System.out.println("Execution state: "+t.getState());
		

		System.out.println("dead state: "+t.getState());

	}

}
