package ArrayList;

import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
    static void main() throws NoSuchFieldException, IllegalAccessException, InaccessibleObjectException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        //add
        list.add(1,5);
        System.out.println("\n"+ list);

        //remove
        list.remove(2);
        System.out.println(list);

        //add first and last
        list.addFirst(6);
        list.addLast(7);
        System.out.println(list);

        //check empty
        System.out.println(list.isEmpty());

        //set at index or replace
        list.set(0,0);
        System.out.println(list);

        //find size
        System.out.println(list.size());

        //check element contains
        System.out.println(list.contains(3));


        List<Integer> list2 = List.of(5,6,7,8,9);
        list.addAll(list2);
        System.out.println(list);


        Collections.sort(list);
        System.out.println(list);

        int frequency = Collections.frequency(list, 5);
        System.out.println(frequency);

        Collections.reverse(list);
        System.out.println(list);
    }
}
