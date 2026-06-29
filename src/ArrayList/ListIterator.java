package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator {
    static void main() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer num = it.next();
            if (num == 5) {
                it.remove();
            }
        }
        System.out.println(list);

    }
}
