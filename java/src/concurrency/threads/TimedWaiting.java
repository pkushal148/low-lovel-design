package concurrency.threads;


public class TimedWaiting {
    public static void main(String[] args) throws InterruptedException {
        Thread sleeper = new Thread(() -> {
            System.out.println("Sleeper: going to sleep for 1 seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Sleeper: interrupted!");
                return;
            }
            System.out.println("Sleeper: woke up naturally");
        });

        sleeper.start();
        Thread.sleep(100);

        System.out.println("Sleeper state: " + sleeper.getState());  // TIMED_WAITING

//        sleeper.interrupt();

        sleeper.join();
    }
}