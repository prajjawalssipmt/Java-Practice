package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImplementation {
    static void main() {

        // Collection Stream list
        System.out.println("Collection Stream Approach");
        List<Integer> list = Arrays.asList(12, 23, 34, 45, 56, 67, 78);
        list.stream().forEach(System.out::println);

        System.out.println("Array Stream Approach");
        //Array Stream
        int[] arrar=new int[]{98,87,76,54,43,21};
        Arrays.stream(arrar).filter(x -> x%2==0).forEach(System.out::println);

        System.out.println("Stream.of() Approach");
        //Stream of()
        List<String> streamOf = Stream.of("Prajjawal", "Gupta", "Tanmay", "Jaggu", "Devesh")
                .map(String::toUpperCase).toList();
        System.out.println(streamOf);


        System.out.println("Infinite Stream Approach Using generate()");
        Stream.generate(()->1).limit(3).forEach(System.out::println);

        System.out.println("Infinite Stream Approach Using iterator()");
        Stream.iterate(1, x -> x + 1).limit(3).forEach(System.out::println);


    }
}
