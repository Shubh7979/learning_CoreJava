package basicMultithreading;

public class DaemonUserThreadDemo {
	public static void main(String[] args) {
		Thread bgThread = new Thread(new DaemonHelper());
		Thread userThread = new Thread(new UserThreadHelper());
		Thread mngo = new Thread(new mango());
		
		bgThread.setDaemon(true);
		
		bgThread.start();
		mngo.start();
		userThread.start();
		
	}
}

class DaemonHelper implements Runnable{
	
	public void run() {
		int count = 0;
		while(count<500) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
		System.out.println("Daemon helper Running...");
		}
	}


}

class mango extends Thread{
	@Override
	public void run() {
		int i =500;
		while(i>0) {
			System.out.println("mango");
			i--;
		}
	}
}

class UserThreadHelper implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User THread done with execution...");
		
	}
	
}