package MultiThreading.BasicCreationOfThread.UsingThread;

public class Hello {
    static void main() {

        World world=new World();
        world.start();

        for (;;){
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }


    }
}
