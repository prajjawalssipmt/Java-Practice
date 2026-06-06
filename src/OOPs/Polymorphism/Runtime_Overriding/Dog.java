package OOPs.Polymorphism.Runtime_Overriding;

public class Dog extends Animal {

    public void sound(){
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Eating bones");
    }
}
