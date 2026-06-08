package Exception.Bank;

// Custom business logic exception for banking
public class InsufficientFundsException extends RuntimeException {

    private double amount;

    // Constructor to pass a custom error message
    public InsufficientFundsException(String message) {
        super(message);
    }

    public void getBalance(double amount) {
        this.amount = amount;
    }
}
