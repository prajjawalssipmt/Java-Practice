package MultiThreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestExecutor {
    static void main() {
        long currentTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(()->{
                long factorial = factorial(finalI);
                System.out.println(factorial);
            });
        }
        executor.shutdown();

        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        long endTime = System.currentTimeMillis()-currentTime;
        System.out.println("Total Time Taken : "+endTime);

    }

    public static long factorial(long n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;

        }
        return result;
    }
}
