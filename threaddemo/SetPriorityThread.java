package threaddemo;

public class SetPriorityThread extends Thread {
	
	public void run() {
		
		System.out.println("thread");
	}
	
	public static void main(String[] args) {
		
		SetPriorityThread s1 = new SetPriorityThread();
		SetPriorityThread s2 = new SetPriorityThread();
		SetPriorityThread s3 = new SetPriorityThread();
		
		System.out.println(s1.getPriority());
		System.out.println(s2.getPriority());
		System.out.println(s3.getPriority());

		s1.setPriority(MIN_PRIORITY);
		s2.setPriority(MAX_PRIORITY);
		s3.setPriority(NORM_PRIORITY);
		
		System.out.println(s1.getPriority());
		System.out.println(s2.getPriority());
		System.out.println(s3.getPriority());
		
	}
}
