package Queue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestConcurrentLinkedQueue {
    static void main() throws InterruptedException {
        ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //producer
        executor.submit(()->{
            taskQueue.offer("Data Packet A");
            taskQueue.offer("Data Packet B");
        });

        //consumer
        executor.submit(()->{
           while (true){
               String poll = taskQueue.poll();
               if (poll != null){
                   System.out.println("Received: " + poll);
                   break;
               }
           }
        });

        executor.shutdown();
        executor.awaitTermination(3, TimeUnit.SECONDS);

    }
}
