package threaddemo;

public class JoinMethod extends Thread{

	public void run() {
		for(int i=0;i<=4;i++) {
			
			try {
				
				//Thread.sleep(0);
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		JoinMethod j1 = new JoinMethod();
		JoinMethod j2 = new JoinMethod();
		JoinMethod j3 = new JoinMethod();
		one o1 = new one();
		
//		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j1.start();
		j2.start();
		j3.start();
		o1.start();
		Thread.currentThread().setName("hello");
		System.out.println(Thread.currentThread().getName());

	}

}


class one extends Thread{
	@Override
	public void run() {
		
		for(int i = 0;i<50;i++) {
			
			System.out.println("This is one Thread");
		}
		super.run();
	}
}