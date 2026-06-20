package designPatterns.observer;

public class ConcreteObserver1 implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("notification from o1");
    }
}
