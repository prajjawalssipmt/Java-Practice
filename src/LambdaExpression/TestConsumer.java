package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    static void main() {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 9, 6, 4, 1);

        //consumer do not return anything
        Consumer<List<Integer>> multiplyList=x->{
            x.replaceAll(n->n*3);
        };
        multiplyList.accept(list);

        System.out.println();
        Consumer<List<Integer>> printList=y->{

            System.out.println("Processed List : "+y);
        };

        System.out.println();
        Consumer<List<Integer>> printList2= multiplyList.andThen(printList);
        printList2.accept(list);
    }
}
