package MultiThreading.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw : "+amount);
        try {
            if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+"Proceeding to withdraw");
                        Thread.sleep(2000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+" completed withdraw : "+amount+" remaining balance : "+balance);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }finally {
                        lock.unlock();
                    }

                }else {
                    System.out.println(Thread.currentThread().getName()+" failed withdraw/Insufficient balance");
                }

            }else {
                System.out.println(Thread.currentThread().getName()+" couldnt acquire lock");
            }
        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName()+"interrupted");
        }

    }
}
