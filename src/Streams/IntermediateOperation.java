package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {
    static void main() {
        List<String> list = Arrays.asList("Prajjawal", "Tanmay", "Prajju", "Prasanna", "Aashay");
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("*************FILTER**************");
        //filter
        Stream<String> filterPra = list.stream().filter(str -> str.startsWith("Praj"));
        filterPra.forEach(System.out::println);

        System.out.println("*************MAP**************");
        //map
        Stream<Integer> integerStream = numList.stream().filter(number -> number % 2 == 0).map(number -> number * number);
        integerStream.forEach(System.out::println);

        System.out.println("*************SORTED**************");
        //sorted
        Stream<String> sorted = list.stream().sorted((a,b) -> a.compareTo(b));
        sorted.forEach(System.out::println);

        System.out.println("*************DISTINCT**************");
        //distinct
        list.stream().filter(a->a.startsWith("Pra")).distinct().forEach(System.out::println);

        System.out.println("*************PEEK**************");
        numList.stream().peek(System.out::println).forEach(System.out::println);



    }
}
