package OOPs.Interface.Animals;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep");

    }
}
