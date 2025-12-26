package finalKeyword;

class UserAccount{
	
	final String accountNumber= "Acc353454";
	public void display() {
		System.out.println(accountNumber);
	}
}

public class finalkeyword {

	public static void main(String[] args) {

		UserAccount u = new UserAccount();
		u.display();
//		accountNumber = "Acc1552" ;  can't be changed due to final keyword
		
		
	}

}
