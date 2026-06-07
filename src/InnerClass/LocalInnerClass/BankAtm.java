package InnerClass.LocalInnerClass;

public class BankAtm {

    private double accountBalance=5000.0;


    public void processWithdrawl(double amount){

        class TransactionValidator{

            public double getBalance(){
                return accountBalance-amount;
            }

            void validate(){
                if (amount<=0){
                    System.out.println("Invalid amount!");
                }else if (amount>accountBalance){
                    System.out.println("Insufficient balance!");
                }else {
                    accountBalance-=amount;
                    System.out.println("Transaction Success : "+amount);
                    System.out.println("Remaining Balance : "+accountBalance);
                }
            }
        }

        TransactionValidator validator = new TransactionValidator();
        validator.validate();
    }

    static void main() {
        BankAtm atm = new BankAtm();
        atm.processWithdrawl(-20);
        atm.processWithdrawl(5002);
        atm.processWithdrawl(500);
//        atm.processWithdrawl();
    }
}
