package Exception.Bank;
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        System.out.println("Attempting to withdraw: $" + amount);

        // Business Rule Violation Check
        if (amount > balance) {
            // Throwing our custom exception with an informative message
            throw new InsufficientFundsException(
                    "Transaction Denied! You requested $" + amount + " but your balance is only $" + balance
            );
        }

        // Processing withdrawal if balance is sufficient
        balance -= amount;
        System.out.println("Success! Remaining Balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}
