package MultiThreading.Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFuture1 {
    static void main() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        //Runnable used in submit method
        Future<?> future = executor.submit(() -> {
            System.out.println("Hello Prajjawal");
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        if (future.isDone()){
            System.out.println("Task completed");
        }

        executor.shutdown();

    }
}
