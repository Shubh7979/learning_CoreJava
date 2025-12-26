package testAbstraction;

abstract class Bank{
	
	abstract int interestRate();
}

class SBI extends Bank{
	public int interestRate() {
		return 5;
	}
}

class Axis extends Bank{
	public int interestRate() {
		return 8;
	}
}

class HDFC extends Bank{
	public int interestRate() {
		return 9;
	}
}

public class TestIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b,b1,b2;
		
		b=new SBI();
		System.out.println("rate of interest: "+ b.interestRate() + "%");
		
		b1=new Axis();
		System.out.println("rate of interest: "+ b1.interestRate() + "%");

		b2=new HDFC();
		System.out.println("rate of interest: "+ b2.interestRate() + "%");

	}

}
