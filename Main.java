// Name: Mahi Jadeja
// PRN: 23070126068
// Batch: A-3

package threadexample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        ThreadExample thread1 = new ThreadExample("Thread-1");
        ThreadExample thread2 = new ThreadExample("Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread completed.");
    }
}