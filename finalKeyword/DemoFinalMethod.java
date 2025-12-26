package finalKeyword;

class bank {
	
	final void processTransaction() {
		System.out.println("Processing bank Transactions");
	}
}

public class DemoFinalMethod  extends bank// if extend bank override error due to final method
{
	public void processTransaction()   //cannot override final method
	{  
		System.out.println("Calling from final method");		
	}
//	
	public void payBill() {
		System.out.println("Callling fron final Method");
	}
	
	public static void main(String[] args) {
		
		
		bank b = new bank();
		b.processTransaction();
		
		DemoFinalMethod  d = new DemoFinalMethod();
		d.payBill();
		
	}
}
