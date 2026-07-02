package Streams;

import java.util.Arrays;
import java.util.List;

public class Challenges {
    static void main() {

        //finding name whose length > 3
        List<String> list = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println( list.stream().filter(x -> x.length() > 3).toList());

        //squaring and then sorting
        List<Integer> numList = Arrays.asList(9, 7, 4, 1, 3, 6);
        System.out.println(numList);
        List<Integer> list1 = numList.stream().map(x -> (int) Math.pow(x, 2)).sorted().toList();
        System.out.println(list1);

        //sum of all List values
        Integer sumList = list1.stream().reduce((x, y) -> x + y).get();
        System.out.println(sumList);


    }
}
