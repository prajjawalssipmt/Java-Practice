package LambdaExpression;

import java.util.function.Function;

public class TestFunction {
    static void main() {
        long start = System.currentTimeMillis();

        Function<Integer,Integer> doubleIt=x -> 2*x;
        Function<Integer,Integer> tripleIt=x -> 3*x;
        System.out.println("Double of 4 : "+doubleIt.apply(4));
        System.out.println("Double of 4 : "+tripleIt.apply(4));

        Integer apply = tripleIt.andThen(doubleIt).apply(9);
        System.out.println(apply);

        Integer apply1 = doubleIt.compose(tripleIt.andThen(tripleIt)).apply(9);
        System.out.println(apply1);

        Function<String, String> identity = Function.identity();
        System.out.println(identity.apply("hello Prajjawal"));

        long end = System.currentTimeMillis();
        System.out.println("Time in millis : "+(end-start));


    }
}
