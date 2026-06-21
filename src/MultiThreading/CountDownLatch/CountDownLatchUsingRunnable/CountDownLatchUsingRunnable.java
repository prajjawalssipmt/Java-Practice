package MultiThreading.CountDownLatch.CountDownLatchUsingRunnable;


import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchUsingRunnable {
    static void main(String[] args) throws InterruptedException {

        int numberOfServices=3;

        CountDownLatch latch = new CountDownLatch(numberOfServices);
        for(int i=0;i<numberOfServices;i++){
            new Thread(new DependentService(latch)).start();
        }
        latch.await();

        Thread.sleep(2000);
        System.out.println("Finished all services");



    }
}

 class DependentService implements Runnable{

    private CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName()+" Service Started");

        }finally {
            latch.countDown();
        }

    }
}
