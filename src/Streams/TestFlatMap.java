package Streams;

import java.util.Arrays;
import java.util.List;

public class TestFlatMap {
    static void main() {
        List<Integer> primeList = Arrays.asList(5, 7, 11, 13, 17, 23, 29);
        List<Integer> evenList = Arrays.asList(2,4,8,12,14,46,78);
        List<Integer> oddList = Arrays.asList(21,45,77,95);

        List<List<Integer>> allList = Arrays.asList(primeList, evenList, oddList);

        List<Integer> list = allList.stream().flatMap(x -> x.stream()).sorted().toList();
        System.out.println(list);


        // Creating a List of Lists
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        List<String> strList = listOfLists.stream().flatMap(x -> x.stream()).toList();
        System.out.println(strList);

    }
}
