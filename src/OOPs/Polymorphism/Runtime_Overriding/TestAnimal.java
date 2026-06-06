package OOPs.Polymorphism.Runtime_Overriding;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.sound();


        Cat cat = new Cat();
        cat.eat();
        cat.sound();

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.sound();

    }
}
