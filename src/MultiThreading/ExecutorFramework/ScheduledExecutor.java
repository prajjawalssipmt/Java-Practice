package MultiThreading.ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    static void main() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(
                ()-> System.out.println("Task executed at every 5 seconds"),
                1,
                2,
                TimeUnit.SECONDS);


        scheduler.schedule(
                ()-> {
                    System.out.println("Initializing Shutdown...");
                    scheduler.shutdown();
                },7, TimeUnit.SECONDS);
    }
}
