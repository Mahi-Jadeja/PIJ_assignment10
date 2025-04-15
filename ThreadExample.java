package threadexample;

// This class demonstrates thread behavior by extending Thread class
public class ThreadExample extends Thread {
    private String threadName;

    public ThreadExample(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        // Simulate some work with a loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: iteration " + i);
            try {
                Thread.sleep(500); // Sleep to simulate delay
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " has finished execution.");
    }
}