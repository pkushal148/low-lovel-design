package concurrency.threads;

public class NewThread {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("started");
        });

        System.out.println("Thread state: "+thread.getState());
        System.out.println("Thread present: "+thread.isAlive());
    }
}
