package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class TestingIterator {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println(numbers);

        //we cannot remove element while iterating
//        for (Integer number : numbers) {
//            if (number%2==0){
//                System.out.println(numbers.remove(number));
//            }
//        }

        //this also fails when removing element while iterating
//        for (Integer number : numbers) {
//            if (number%2==0){
//                System.out.println();
//                iterator.remove();
//            }
//        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next%2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
