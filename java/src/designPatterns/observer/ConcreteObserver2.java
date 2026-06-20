package designPatterns.observer;

public class ConcreteObserver2 implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Notification from o2");
    }
}
