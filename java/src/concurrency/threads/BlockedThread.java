package concurrency.threads;

public class BlockedThread {

    private static final Object object  = new Object();
    public static void main(String[] args) throws InterruptedException {

        Thread holder = new Thread(()->{
            synchronized (object){
                System.out.println("holder acquired lock");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Holder: releasing lock");
            }
        },"LockHolder");

        Thread waiter = new Thread(()->{
            System.out.println("waiting for lock releasal");
            synchronized (object){
                System.out.println("waiter acquired lock");
            }

        },"LockWaiter");

        holder.start();
        Thread.sleep(100);

        waiter.start();
        Thread.sleep(100);

        System.out.println("Holder state: "+holder.getState()); //Running
        System.out.println("Waiter state: " + waiter.getState());  // BLOCKED

        holder.join();
        waiter.join();
    }
}
