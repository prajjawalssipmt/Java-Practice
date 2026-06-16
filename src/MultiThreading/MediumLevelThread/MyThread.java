package MultiThreading.MediumLevelThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running.....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted -> "+ e);
        }
    }

    static void main() {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
    }
}
