package LambdaExpression;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Testing_Bi_Interface {
    static void main() {
        //Predicate, Function, Consumer all take only one object
        //But BiPredicate, BiFunction, BiConsumer all take two object

        BiPredicate<Integer, Integer> isSumEven=(x, y)->(x+y)%2==0;
        System.out.println(isSumEven.test(1, 2));

        BiConsumer<Integer, String> add=(x, y)->{
            System.out.println(x+y);
        };
        add.accept(1, " Prajjawal");

        BiFunction<String,String,Integer> checkLength=(x, y)->(x+y).length();
        System.out.println(checkLength.apply("Prajjawal", " Tanmay"));
    }
}
