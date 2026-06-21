package MultiThreading.ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumOfTwoNumber {
    static void main() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executor.submit(() -> 1 + 2);
        Thread.sleep(2000);
        Integer i = submit.get();
        System.out.println("sum is : "+i);
        executor.shutdown();
        System.out.println("IsShutdown : "+executor.isShutdown());
    }
}
