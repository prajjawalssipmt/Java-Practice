package OOPs.Inheritance;

public class Child extends Parent {
//    public Child(String name, int age) {
//        super(name, age);
//    }

    public Child() {
        System.out.println("Child constructor");
    }

    public void childMethod() {
        System.out.println("Child method");
        super.parentMethod();
    }
}
