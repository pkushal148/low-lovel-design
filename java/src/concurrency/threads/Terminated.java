package concurrency.threads;

public class Terminated {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Worker: starting");
            for (int i = 0; i < 5; i++) {
                System.out.println("Worker: " + i);
            }
            System.out.println("Worker: done");
        });

        thread.start();
        thread.join();

        System.out.println("Worker state: " + thread.getState());
        System.out.println("Is alive: " + thread.isAlive());

        try {
            thread.start();
        } catch (IllegalThreadStateException e){
            System.out.println("Cannot restart: " + e.getMessage());
        }
    }
}
