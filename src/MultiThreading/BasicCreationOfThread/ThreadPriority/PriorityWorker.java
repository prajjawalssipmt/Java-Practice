package MultiThreading.BasicCreationOfThread.ThreadPriority;
class PriorityWorker extends Thread {

    public PriorityWorker(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running with priority: " + getPriority());
    }

    public static void main(String[] args) {
        PriorityWorker lowThread = new PriorityWorker("Low-Priority-Thread");
        PriorityWorker highThread = new PriorityWorker("High-Priority-Thread");
        PriorityWorker mediumThread = new PriorityWorker("Medium-Priority-Thread");

        // 1. Assign priority values
        lowThread.setPriority(Thread.MIN_PRIORITY);  // Value: 1
        highThread.setPriority(Thread.MAX_PRIORITY); // Value: 10
        mediumThread.setPriority(Thread.NORM_PRIORITY);

        // 2. Start the threads
        lowThread.start();
        highThread.start();
        mediumThread.start();
    }
}

