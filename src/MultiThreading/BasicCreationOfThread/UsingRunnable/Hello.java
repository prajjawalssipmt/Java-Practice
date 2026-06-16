package MultiThreading.BasicCreationOfThread.UsingRunnable;

public class Hello {
    static void main() {

        World world=new World(); //NEW
        Thread t1=new Thread(world);  //NEW
        t1.start(); //RUNNABLE

        for (;;){
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
