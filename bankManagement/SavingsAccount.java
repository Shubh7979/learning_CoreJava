package bankManagement;

public class SavingsAccount extends Account {

    private double interestRate = 4.0;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}
