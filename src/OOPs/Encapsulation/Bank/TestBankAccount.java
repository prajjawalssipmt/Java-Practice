package OOPs.Encapsulation.Bank;

public class TestBankAccount {
    static void main() {
        BankAccount ba=new BankAccount();

        ba.setAcNumber(38025354);
        System.out.println(ba.getAcNumber());
        ba.deposit(-123);
        ba.withdraw(980);
        ba.deposit(100);
        ba.withdraw(10);
        System.out.println(ba.getBalance());
    }
}
