package concurrency.threads;

public class WaitingThreads {

    public static final Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread waiter = new Thread(()->{
            synchronized (object){
                System.out.println("Waiter entering state");
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Waiter: woken up!");
            }
        });

        waiter.start();
        Thread.sleep(100);

        System.out.println("waiter state : "+waiter.getState());

        synchronized (object){
            object.notify();
        }

        waiter.join();

    }
}
