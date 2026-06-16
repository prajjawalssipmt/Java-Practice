package MultiThreading.Lock;

public class TestBank {
    static void main() {
        BankAccount sbi=new BankAccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(20);
            }
        };

        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();
    }
}
