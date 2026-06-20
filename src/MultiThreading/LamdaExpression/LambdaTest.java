package MultiThreading.LamdaExpression;

public class LambdaTest {
    static void main() {

//        (type 1)
//        Runnable runnable = new Runnable() {
//            public void run() {
//                System.out.println("Thread 1: Holding Lock B...");
//            }
//        };

//        (type 2)
//        Runnable runnable = () -> {
//            System.out.println("Thread 1: Holding Lock B...");
//        };

//        Thread t1 = new Thread(runnable);
//        t1.start();

        Thread t1=new Thread(() -> System.out.println("Runnable Directly inside the Thread Constructor"));
        t1.start();

    }
}
