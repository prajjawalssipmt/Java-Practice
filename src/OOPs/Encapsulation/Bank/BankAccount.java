package OOPs.Encapsulation.Bank;

public class BankAccount {
    private long acNumber;
    private double balance;


    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Amount deposited: "+amount+" & Balance: "+balance);
        }else {
            System.out.println("Invalid amount");
        }
    }


    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw Success: "+amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public long getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(long acNumber) {
        this.acNumber = acNumber;
    }

    public double getBalance() {
        return balance;
    }


}
