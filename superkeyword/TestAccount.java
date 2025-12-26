package superkeyword;

class BankAccount{
	
	String bankName = "State Bank of india";
	
	public BankAccount(int id) {
		
		System.out.println(id);
		System.out.println("Bank account Constructor called ");
	}
	
	public void displayAccountType() {
		
		System.out.println("Account Type: General bank account ");
		
	}
	
}

class SavingAccount extends BankAccount {
	
	String bankName = "HDFC";
	public SavingAccount() {

		super(100);
		System.out.println("Saving Account constructor called");
	}
	
	public void displayDetails() {
		
		super.displayAccountType();
		System.out.println("Child Bank Name: "+ bankName );
		System.out.println("parent Bank Name: "+ super.bankName );
	}
	
}

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SavingAccount s = new SavingAccount();
		s.displayDetails();
	}

}
