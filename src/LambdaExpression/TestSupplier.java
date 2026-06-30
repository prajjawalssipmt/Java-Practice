package LambdaExpression;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Supplier;

public class TestSupplier {
    static void main() {
        Supplier<LocalTime> timeSupplier = ()-> LocalTime.now();
        System.out.println(timeSupplier.get());
    }
}
