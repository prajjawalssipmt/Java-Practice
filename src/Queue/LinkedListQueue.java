package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    static void main() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
//        queue.offer(6);
        System.out.println(queue);

        Queue<Integer> contains = new LinkedList<>();
        contains.offer(4);
        contains.offer(5);
        contains.offer(6);


        System.out.println(queue.remove());
        queue.poll();
        System.out.println(queue);


        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.contains(5));
        System.out.println(queue.containsAll(contains));




    }
}
