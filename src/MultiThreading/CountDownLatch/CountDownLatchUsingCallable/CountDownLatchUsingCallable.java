package MultiThreading.CountDownLatch.CountDownLatchUsingCallable;


import java.util.concurrent.*;

public class CountDownLatchUsingCallable {
    static void main(String[] args) throws InterruptedException {

        int numberOfServices=3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();

        System.out.println("Finished all services");
        executorService.shutdown();


    }
}

 class DependentService implements Callable<String>{

    private CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public String call() throws Exception {

        try {
            System.out.println(Thread.currentThread().getName()+" Service Started");
            return "ok";
        }finally {
            latch.countDown();
        }

    }
}
