package Generics.PracOne.GenericClass;

public class TestPair {
    static void main() {
        Pair<Integer, String> pair = new Pair<>(1,"Prajjwal");

        System.out.println(pair.getKey()+" : "+pair.getValue());
    }
}
