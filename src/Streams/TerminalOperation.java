package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {
    static void main() {
        List<Integer> list = Arrays.asList(6, 5, 4, 3, 2, 1, 8, 9, 7,7,1);


        //skip, toSet and forEach
        Stream<Integer> skipSet = list.stream().skip(2).collect(Collectors.toSet()).stream();
        skipSet.forEach(System.out::println);

        //reduce
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

        //anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 1);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x <10);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x <0);
        System.out.println(b2);



    }
}
