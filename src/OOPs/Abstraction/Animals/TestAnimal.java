package OOPs.Abstraction.Animals;

public class TestAnimal {
    static void main() {
        Dog d = new Dog();
        Kangaroo k = new Kangaroo();

        d.setAge(12);
        System.out.println(d.getAge());
        k.setAge(22);
        System.out.println(k.getAge());
        d.walk();
        k.walk();
    }
}
