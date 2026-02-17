package threaddemo;

class NotTest{
	
	synchronized void waitingMethod() {
		
		System.out.println(Thread.currentThread().getName() + " is waiting");
		
		try {
			wait();
			System.out.println(Thread.currentThread().getName() + " is resumed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

	
	synchronized void NotifyMethod() {
		
		System.out.println("notify all method");
		notifyAll();
	}
	

}

class MyThreadDemo extends Thread{
	NotTest t;
	
	public MyThreadDemo(NotTest t) {
		
		this.t=t;
	}
	
	@Override
	public void run() {
		t.waitingMethod();
	}
}

public class TestNotifyAll {

	public static void main(String[] args) throws InterruptedException{
		
		NotTest obj = new NotTest();
		
		MyThreadDemo t1 = new MyThreadDemo(obj);
		MyThreadDemo t2 = new MyThreadDemo(obj);
		
		t1.setName("Thread : 1");
		t2.setName("Thread : 2");
		
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		
		obj.NotifyMethod();
	}

}
