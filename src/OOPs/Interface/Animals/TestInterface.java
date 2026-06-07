package OOPs.Interface.Animals;

public class TestInterface {
    static void main() {
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.eat();
        cat.sleep();
        dog.eat();
        dog.sleep();

        System.out.println(Dog.legs);
        System.out.println(Animal.legs);

        Animal.info();

        dog.run();
        cat.run();

    }
}
