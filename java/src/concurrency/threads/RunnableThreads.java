package concurrency.threads;

public class RunnableThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                Math.sqrt(i);
            }
        });

        thread.start();

        Thread.sleep(1);

        System.out.println("State: " + thread.getState());
        thread.join();
    }
}
