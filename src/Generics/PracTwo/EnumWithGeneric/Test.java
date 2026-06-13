package Generics.PracTwo.EnumWithGeneric;

public class Test {
    static void main() {
        double add = Operation.ADD.apply(20, 34);
        System.out.println(add);

        double sub = Operation.SUBTRACT.apply(111, 34);
        System.out.println(sub);

        double multi = Operation.MULTIPLY.apply(20, 34);
        System.out.println(multi);

        double div = Operation.DIVIDE.apply(111, 34);
        System.out.println((double)Math.round(div));

        double str=Operation.MULTIPLY.apply(11.22,2);
        System.out.println(str);

    }
}
