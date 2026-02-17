package threaddemo;

class Customer{
	
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		
		System.out.println("Going to Withdraw...");
		
		if(this.amount < amount) {
			
			System.out.println("less balance... Waiting for Deposit...");
			
			try {
				
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.amount -= amount;
		System.out.println("withdraw Completed");
		
	}
	
	synchronized void deposit(int amount) {
		System.out.println("system is going to deposit...");
		
		this.amount += amount;
		System.out.println("Deposit complete...");
		
		notify();
		
	}
	
}

public class DemoInterThreadCommunication {

	public static void main(String[] args) {
		
		final Customer c = new Customer();
		
		new Thread() {
			public void run() {
					
				c.withdraw(15000);
			}
			
		}.start();
		
		new Thread() {
			public void run() {
				
				c.deposit(15000);
			}
		
		}.start();

	}

}
