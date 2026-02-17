package sequential;

public class ExtendsThreadExample {
	
	public static void main(String[] args) {
		
		thread1 one = new thread1();
		thread2 two = new thread2();
		
		one.start();
		two.start();
		
		one.setPriority(10);
		two.setPriority(3);
		System.out.println(one.getPriority());
		System.out.println(two.getPriority());
		
	}

}

class thread1 extends Thread{
	@Override
	public void run() {

		for (int i= 0;i<500;i++) {
			System.out.println("Thread1: "+i);
		}
	}
	
}

class thread2 extends Thread{
	@Override
	public void run() {

		for (int i= 0;i<500;i++) {
			System.out.println("Thread1: hello");
		}
	}
}