package Exception.Bank;

public class BankSystemTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("ACC12345", 1000.00);

        System.out.println("--- Current Balance: $" + myAccount.getBalance() + " --- \n");

        // Scenario 1: Successful Withdrawal
        try {
            myAccount.withdraw(400.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n-----------------------------------------\n");

        // Scenario 2: Triggers the Custom Exception
        try {
            myAccount.withdraw(800.00); // Fails because balance is now $600
        } catch (InsufficientFundsException e) {
            // Catching and processing our custom exception explicitly
            System.out.println("Caught Custom Error: " + e.getMessage());
        }

        System.out.println("\n--- Session Closed Safely ---");
    }
}
