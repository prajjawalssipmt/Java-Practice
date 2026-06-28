package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    static void main() {

        //Comparable
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(23);
        minHeap.offer(66);
        minHeap.offer(11);
        minHeap.offer(98);
        minHeap.offer(43);
        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll()+" ");
        }


        //comparator used i.e. Collections.reverseOrder()
        System.out.println();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(23);
        maxHeap.offer(66);
        maxHeap.offer(11);
        maxHeap.offer(98);
        maxHeap.offer(43);
        System.out.println(maxHeap);
        System.out.println(maxHeap.peek());
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll()+" ");
        }
    }
}
