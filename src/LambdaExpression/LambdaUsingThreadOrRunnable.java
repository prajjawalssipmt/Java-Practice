package LambdaExpression;

public class LambdaUsingThreadOrRunnable {
    static void main() {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        Thread t2 = new Thread(()->{
            for(int i=0;i<5;i++) {
                System.out.println("Hii Praj");
            }
        });

        t2.start();




    }

}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Hii Prajjawal");
        }
    }
}