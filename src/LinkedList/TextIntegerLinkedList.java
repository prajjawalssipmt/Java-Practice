package LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class TextIntegerLinkedList {
    static void main() {
        LinkedList<Integer> list = new LinkedList();
        LinkedList<Integer> list2 = new LinkedList(Arrays.asList(7,8,9));
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        System.out.println(list.get(2));

        list.add(2,5);
        System.out.println(list);

        list.addFirst(0);
        list.addLast(6);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list);

        LinkedList<Integer> removeFromList=new LinkedList<>(Arrays.asList(1,2));
        list.removeAll(removeFromList);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.removeIf(x -> x %2 == 0);
        System.out.println(list);

    }
}
