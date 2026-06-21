package MultiThreading.ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestDotGetMethod {
    static void main() {
        ExecutorService executor = Executors.newSingleThreadExecutor();

// Submit a task that returns a String after 2 seconds
        Future<String> future = executor.submit(() -> {
            Thread.sleep(2000);
            return "Task Completed!";
        });

        try {
            // This line blocks and waits for the 2 seconds to pass
            String result = future.get();
            System.out.println(result); // Prints: Task Completed!
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

    }
}
