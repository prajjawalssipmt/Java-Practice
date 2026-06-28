package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TestDeque {
    static void main() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(49);
        deque.offer(11);
        deque.offer(32);
        deque.offer(23);
        deque.offer(49);
        deque.offer(25);
        System.out.println(deque);

        deque.addFirst(76);
        deque.addLast(87);
        System.out.println(deque);

        deque.offerFirst(81);
        deque.offerLast(56);
        System.out.println(deque);

        System.out.println(deque.removeFirstOccurrence(49));
        System.out.println(deque.removeLastOccurrence(49));
        System.out.println(deque);

        Iterator<Integer> reverse = deque.descendingIterator();

        System.out.println("Descending Iterator");
        while (reverse.hasNext()) {
            System.out.print("->"+reverse.next());
        }

        System.out.println("\nUsed isEmpty()");
        while (!deque.isEmpty()){
            System.out.print("-->"+deque.pollLast());
        }




    }
}
