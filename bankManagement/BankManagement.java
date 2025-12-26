package bankManagement;

import java.util.Scanner;



public class BankManagement {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(101, "Shubham", 5000);

        int choice;
        do {
            System.out.println("--- Bank Menu ---\n");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Add Interest");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    account.addInterest();
                    break;
                case 5:
                    System.out.println("Thank you for using the bank system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
