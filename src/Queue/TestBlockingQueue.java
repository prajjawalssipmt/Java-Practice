package Queue;

import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;


class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private int value=0;
    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Producer produced: "+value);
            try {
                queue.put(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}


class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){

            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed: "+value);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}

public class TestBlockingQueue {
    static void main() {
        BlockingQueue<Integer> arrayBlocking = new ArrayBlockingQueue<>(7);

        Thread producer = new Thread(new Producer(arrayBlocking));
        Thread consumer = new Thread(new Consumer(arrayBlocking));
        producer.start();
        consumer.start();

        //it will go infinite so you have to close the program.

    }
}
