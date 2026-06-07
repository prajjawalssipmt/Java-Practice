package OOPs.Polymorphism.CompileTime_Overloading;

public class TestAddition {
    static void main() {
        Addition addition = new Addition();
        System.out.println(addition.add(10, 20));
        System.out.println(addition.add(10, 20,30));
        System.out.println(addition.add("Prajjawal","gupta"));


    }
}
