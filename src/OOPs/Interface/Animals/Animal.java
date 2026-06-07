package OOPs.Interface.Animals;

public interface Animal {

    //static constant
    public static final  int legs=4;

    //abstract method
    public abstract void eat();
    void sleep();

    //static method is only accessible by interface
    public static void info(){
        System.out.println("Animal info");
    }

    //default method is also called concrete method
    //it is only accessible by object
    public default void run(){
        this.eat();
        System.out.println("Animal run");

    }



}
