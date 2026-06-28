package HashTable;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> pageViews = new ConcurrentHashMap<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Simulate 3 concurrent users incrementing the home page view count
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                // ATOMIC UPDATE: Safe from race conditions
                pageViews.merge("homePage", 1, Integer::sum);
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Total views: " + pageViews.get("homePage")); // Always prints 1000
    }
}
