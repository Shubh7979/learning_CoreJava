package threaddemo;

public class DemoThreadLifeCycle extends Thread{
	
	public void run() {
		System.out.println("Running state");
	}

	public static void main(String[] args) {
		
		DemoThreadLifeCycle t = new DemoThreadLifeCycle();
		
		System.out.println("born state: "+t.getState());
		
		t.start();
		System.out.println("ready to execute state: "+t.getState());

		System.out.println("Execution state: "+t.getState());
		

		System.out.println("dead state: "+t.getState());

	}

}
