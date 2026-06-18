package MultiThreading.Deadlock;

public class DeadlockDemo {
    // Two shared resources (keys)
    private static final Object LockA = new Object();
    private static final Object LockB = new Object();

    public static void main(String[] args) {

        // Thread 1 tries to grab LockA then LockB
        Thread t1 = new Thread(() -> {
            synchronized (LockA) {
                System.out.println("Thread 1: Holding Lock A...");

                try { Thread.sleep(50); } catch (Exception e) {} // Small pause

                System.out.println("Thread 1: Waiting for Lock B...");
                synchronized (LockB) {
                    System.out.println("Thread 1: Got both locks!");
                }
            }
        });

        // Thread 2 tries to grab LockB then LockA (Opposite order!)
        Thread t2 = new Thread(() -> {
            synchronized (LockB) {
                System.out.println("Thread 2: Holding Lock B...");

                try { Thread.sleep(50); } catch (Exception e) {} // Small pause

                System.out.println("Thread 2: Waiting for Lock A...");
                synchronized (LockA) {
                    System.out.println("Thread 2: Got both locks!");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
