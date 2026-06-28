package concurrency.criticalSections;

class UnsafeEncounter{
    public static int counter=0;

    public void increment()
    {
        counter++;
    }

    public void decrement(){
        counter--;
    }
}

class SafeEncounter{
    public static int counter=0;

    public synchronized void increment()
    {
        counter++;
    }

    public synchronized void decrement(){
        counter--;
    }
}

class SafeLockEncounter{
    public static int counter =0;
    private final Object lock = new Object();
    public void increment()
    {
        synchronized (lock){
            counter++;
        }
    }
    public synchronized void decrement(){
        synchronized (lock){
            counter--;
        }
    }
}