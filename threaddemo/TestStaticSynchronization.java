package threaddemo;

class PrintDetails{
	
	public void printmessages(String s) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("GoodNight...");
			System.out.println(s);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread111 extends Thread{
	
	PrintDetails d;
	String s;
	
	public MyThread111(PrintDetails d, String s ){
		
		this.d=d;
		this.s=s;
	}
	
	@Override
	public void run() {
		
		d.printmessages(s);
	}
}

public class TestStaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDetails obj1  = new PrintDetails();
		
		PrintDetails obj2  = new PrintDetails();
		
		MyThread111 t1 = new MyThread111(obj1 , "Shubham");
		MyThread111 t2 = new MyThread111(obj2 , "R");
		
		t1.start();
		t2.start();
		
	}

}
