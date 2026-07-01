package Streams;

import java.util.Arrays;
import java.util.List;



public class FIrstStreamCode {
    static void main() {
        List<Integer> numbers = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89);

        //Old Approach
        System.out.println("Old Approach");
        for (Integer num : numbers) {
            if (num%2==0) {
                System.out.print(num+"  ");
            }
        }

        System.out.println("\nStream Approach");
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

    }
}
