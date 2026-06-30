package LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestAll_Predicate_Function_Consumer_Supplier {
    static void main() {
        Predicate<Integer> predicate = x->x%2==0;
        Function<Integer, Integer> function = x->x*x;
        Consumer<Integer> consumer = x->System.out.println(x);
        Supplier<Integer> supplier = () -> 16;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }
    }
}
